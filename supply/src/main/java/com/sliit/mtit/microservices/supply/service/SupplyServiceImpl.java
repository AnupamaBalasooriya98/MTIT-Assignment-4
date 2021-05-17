package com.sliit.mtit.microservices.supply.service;

import com.sliit.mtit.microservices.supply.dto.SupplierCreationRequest;
import com.sliit.mtit.microservices.supply.dto.SupplierCreationResponse;
import com.sliit.mtit.microservices.supply.dto.SupplyRequest;
import com.sliit.mtit.microservices.supply.dto.SupplyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class SupplyServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public SupplyResponse createSupply(SupplyRequest supplyRequest) {

        SupplierCreationRequest supplierCreationRequest = new SupplierCreationRequest();
        supplierCreationRequest.setFullName(supplyRequest.getFullName());
        supplierCreationRequest.setItemType(supplyRequest.getItemType());
        supplierCreationRequest.setItemDetails(supplyRequest.getItemDetails());

        ResponseEntity<SupplierCreationResponse> supplierCreationResponseEntity = restTemplate.postForEntity(
                "http://localhost:8282/suppliers", supplierCreationRequest, SupplierCreationResponse.class);

        SupplyResponse response = new SupplyResponse();
        response.setSupplyId(UUID.randomUUID().toString());
        response.setSupplierId(supplierCreationResponseEntity.getBody().getSupplireId());
        response.setMessage("Successfully created the supply");

        return response;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
