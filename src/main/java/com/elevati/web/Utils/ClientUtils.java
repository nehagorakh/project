package com.elevati.web.Utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.elevati.web.Bean.ClientOrders;

@Component
public class ClientUtils {
	
	@Value("${client.order.url}")
	private String clientUrl;
	
	@Autowired
	RestTemplate restTemplate;

	public ClientOrders getOrdersFromUrl() {
		List<Object> ObjectList = null;
		ResponseEntity<ClientOrders> responseEntity = restTemplate.getForEntity(clientUrl, ClientOrders.class);
		return responseEntity.getBody();
	}

}
