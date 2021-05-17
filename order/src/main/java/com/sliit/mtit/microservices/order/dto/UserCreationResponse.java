package com.sliit.mtit.microservices.order.dto;

public class UserCreationResponse {

    private String accountId;
    private String message;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
