package com.sliit.mtit.microservices.orderdelivery.controller;

import com.sliit.mtit.microservices.orderdelivery.dto.OrderDeliveryRequest;
import com.sliit.mtit.microservices.orderdelivery.dto.OrderDeliveryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/deliveries")
public class OrderDeliveryController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody OrderDeliveryResponse createDelivery(@RequestBody OrderDeliveryRequest request) {

        System.out.println("Delivery details: " + request);

        OrderDeliveryResponse response = new OrderDeliveryResponse();
        response.setDeliveryId(UUID.randomUUID().toString());
        response.setMessage("Successfully created the delivery details");

        return response;

    }

}
