package com.sliit.mtit.microservices.supplieraccount.dto;

public class SupplierAccountResponse {

    private String supplierId;
    private String message;

    public String getSupplireId() {
        return supplierId;
    }

    public void setSupplireId(String supplireId) {
        this.supplierId = supplireId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
