package com.sliit.mtit.microservices.supplieraccount.dto;

public class SupplierAccountRequest {

    private String fullName;
    private String itemType;
    private String itemDetails;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    @Override
    public String toString() {
        return "SupplierAccountRequest{" +
                "fullName='" + fullName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemDetails='" + itemDetails + '\'' +
                '}';
    }

}
