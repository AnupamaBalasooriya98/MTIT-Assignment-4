package com.sliit.mtit.microservices.supplieraccount.dto;

public class SupplierAccountResponse {

    private String supplireId;
    private String message;

    public String getSupplireId() {
        return supplireId;
    }

    public void setSupplireId(String supplireId) {
        this.supplireId = supplireId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
