package com.sliit.mtit.microservices.useraccount.controller;

import com.sliit.mtit.microservices.useraccount.dto.UserAccountRequest;
import com.sliit.mtit.microservices.useraccount.dto.UserAccountResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserAccountController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody UserAccountResponse createUserAccount(@RequestBody UserAccountRequest request) {

        System.out.println("User Details: " + request);

        UserAccountResponse response = new UserAccountResponse();
        response.setAccountId(UUID.randomUUID().toString());
        response.setMessage("Successfully created the user account");

        return response;

    }

}
