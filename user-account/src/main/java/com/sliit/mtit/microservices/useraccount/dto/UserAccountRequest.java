package com.sliit.mtit.microservices.useraccount.dto;

public class UserAccountRequest {

    private String fullName;
    private String age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserAccountRequest{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

}
