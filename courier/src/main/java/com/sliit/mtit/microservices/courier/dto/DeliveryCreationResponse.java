package com.sliit.mtit.microservices.courier.dto;

public class DeliveryCreationResponse {

    private String deliveryId;
    private String message;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
