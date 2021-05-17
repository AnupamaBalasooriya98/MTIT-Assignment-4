package com.sliit.mtit.microservices.courier.dto;

public class DeliveryCreationRequest {

    private String fullName;
    private String courierType;
    private String courierDetails;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourierType() {
        return courierType;
    }

    public void setCourierType(String courierType) {
        this.courierType = courierType;
    }

    public String getCourierDetails() {
        return courierDetails;
    }

    public void setCourierDetails(String courierDetails) {
        this.courierDetails = courierDetails;
    }
}
