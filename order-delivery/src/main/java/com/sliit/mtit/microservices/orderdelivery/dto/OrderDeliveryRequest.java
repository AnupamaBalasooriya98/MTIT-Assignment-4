package com.sliit.mtit.microservices.orderdelivery.dto;

public class OrderDeliveryRequest {

    private String fullName;
    private String orderType;
    private String orderDetails;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrderDeliveryRequest{" +
                "fullName='" + fullName + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }

}
