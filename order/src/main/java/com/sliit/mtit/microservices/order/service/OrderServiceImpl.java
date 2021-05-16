package com.sliit.mtit.microservices.order.service;

import com.sliit.mtit.microservices.order.dto.OrderRequest;
import com.sliit.mtit.microservices.order.dto.OrderResponse;
import com.sliit.mtit.microservices.order.dto.UserCreationRequest;
import com.sliit.mtit.microservices.order.dto.UserCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest) {

        UserCreationRequest userCreationRequest = new UserCreationRequest();
        userCreationRequest.setAge(orderRequest.getAge());
        userCreationRequest.setFullName(orderRequest.getFullName());

        ResponseEntity<UserCreationResponse> userCreationResponseEntity = restTemplate.postForEntity(
                "http://localhost:8182/users", userCreationRequest, UserCreationResponse.class);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setUserId(userCreationResponseEntity.getBody().getUserId());
        orderResponse.setMessage("Successfully created the order");

        return orderResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
