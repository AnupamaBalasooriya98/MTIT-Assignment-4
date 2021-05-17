package com.sliit.mtit.microservices.supply.controller;

import com.sliit.mtit.microservices.supply.dto.SupplyRequest;
import com.sliit.mtit.microservices.supply.dto.SupplyResponse;
import com.sliit.mtit.microservices.supply.service.SupplyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/supplies")
public class SupplyController {

    @Autowired
    private SupplyServiceImpl supplyService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody SupplyResponse createSupply(@RequestBody SupplyRequest request) {

        System.out.println("Supply details: " + request);

        return supplyService.createSupply(request);

    }

}
