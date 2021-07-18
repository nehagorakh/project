package com.elevati.web.serviceImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.elevati.web.Bean.ClientOrders;
import com.elevati.web.Bean.Order;
import com.elevati.web.Bean.Response;
import com.elevati.web.Utils.ClientUtils;
import com.elevati.web.entity.OrderEntity;
import com.elevati.web.repository.OrderRepository;
import com.elevati.web.service.CustomerService;
import com.elevati.web.service.OrderService;
import com.elevati.web.service.ProductService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	ClientUtils clientUtils;

	@Override
	public Response saveOrdersFromClientUrl() {
		Response res = new Response();
		ClientOrders clientOrders = null;
		try {
		clientOrders = clientUtils.getOrdersFromUrl();
		List<OrderEntity> orders = getOrders(clientOrders);
		orderRepository.saveAll(orders);
		
		}catch (Exception e) {
			res.setMessage(e.getLocalizedMessage());
			res.setResponseBody(false);
			res.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
			return res;
		}
		
		
		res.setResponseBody(true);
		res.setStatusCode(HttpStatus.OK);
		return res;
	}

	

	private List<OrderEntity> getOrders(ClientOrders clientOrders) {
		List<OrderEntity> orderEntities = new ArrayList<>();
		
		for(Order order : clientOrders.getOrders()){
			OrderEntity orderEntity = new OrderEntity();
			BeanUtils.copyProperties(order, orderEntity);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
			
			orderEntity.setCreatedAt(LocalDateTime.parse(order.getCreatedAt(), formatter));
			orderEntity.setUpdatedAt(LocalDateTime.parse(order.getUpdatedAt(), formatter));
			orderEntity.setProcessedAt(LocalDateTime.parse(order.getProcessedAt(), formatter));
			orderEntity.setTotalItems(order.getNumber());
			
			orderEntities.add(orderEntity);
			
		}
		
		return orderEntities;
	}

}
