package com.sliit.mtit.microservices.orderdelivery.dto;

public class OrderDeliveryResponse {

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
