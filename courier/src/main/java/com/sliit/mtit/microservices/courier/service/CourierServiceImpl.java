package com.sliit.mtit.microservices.courier.service;

import com.sliit.mtit.microservices.courier.dto.CourierRequest;
import com.sliit.mtit.microservices.courier.dto.CourierResponse;
import com.sliit.mtit.microservices.courier.dto.DeliveryCreationRequest;
import com.sliit.mtit.microservices.courier.dto.DeliveryCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class CourierServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public CourierResponse createDelivery(CourierRequest courierRequest) {

        DeliveryCreationRequest deliveryCreationRequest = new DeliveryCreationRequest();
        deliveryCreationRequest.setFullName(courierRequest.getFullName());
        deliveryCreationRequest.setCourierType(courierRequest.getCourierType());
        deliveryCreationRequest.setCourierDetails(courierRequest.getCourierDetails());

        ResponseEntity<DeliveryCreationResponse> deliveryCreationResponseEntity = restTemplate.postForEntity(
                "http://localhost:8382/deliveries", deliveryCreationRequest, DeliveryCreationResponse.class);

        CourierResponse response = new CourierResponse();
        response.setCourierId(UUID.randomUUID().toString());
        response.setDeliveryId(deliveryCreationResponseEntity.getBody().getDeliveryId());
        response.setMessage("Successfully created courier");

        return response;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
