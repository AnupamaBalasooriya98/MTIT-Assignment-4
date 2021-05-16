package com.sliit.mtit.microservices.order.controller;

import com.sliit.mtit.microservices.order.dto.OrderRequest;
import com.sliit.mtit.microservices.order.dto.OrderResponse;
import com.sliit.mtit.microservices.order.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request) {

        System.out.println("Order details: " + request);

        return orderService.createOrder(request);

    }

}
