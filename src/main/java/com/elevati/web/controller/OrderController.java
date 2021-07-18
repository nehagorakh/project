package com.elevati.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elevati.web.Bean.ClientOrders;
import com.elevati.web.Bean.Response;
import com.elevati.web.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("client-url-orders")
	public ResponseEntity<Object> saveProductFromClientUrl(){
		Response res = orderService.saveOrdersFromClientUrl();
		
		if(res.getStatusCode() == HttpStatus.OK)
		return ResponseEntity.ok().body(res.getResponseBody());
			
		return  ResponseEntity.ok().body("some error ocuurred");
		
	}
}
