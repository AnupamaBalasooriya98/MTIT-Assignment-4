package com.sliit.mtit.microservices.supplieraccount.controller;

import com.sliit.mtit.microservices.supplieraccount.dto.SupplierAccountRequest;
import com.sliit.mtit.microservices.supplieraccount.dto.SupplierAccountResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/suppliers")
public class SupplierAccountController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody SupplierAccountResponse createSupplierAccount(@RequestBody SupplierAccountRequest request) {

        System.out.println("Supplier details: " + request);

        SupplierAccountResponse response = new SupplierAccountResponse();
        response.setSupplireId(UUID.randomUUID().toString());
        response.setMessage("Successfully created the supplier account");

        return response;

    }

}
