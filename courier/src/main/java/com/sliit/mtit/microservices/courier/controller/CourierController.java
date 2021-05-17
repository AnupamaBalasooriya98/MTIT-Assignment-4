package com.sliit.mtit.microservices.courier.controller;

import com.sliit.mtit.microservices.courier.dto.CourierRequest;
import com.sliit.mtit.microservices.courier.dto.CourierResponse;
import com.sliit.mtit.microservices.courier.service.CourierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/courier")
public class CourierController {

    @Autowired
    private CourierServiceImpl courierService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody CourierResponse createCourier(@RequestBody CourierRequest request) {

        System.out.println("Courier details: " + request);

        return courierService.createDelivery(request);

    }

}
