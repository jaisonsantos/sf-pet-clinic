package com.springframework.sfpetclinic.model;

/**
 * Created by Jaison on 09/13/2018
 */
public class Person extends BaseEntity {

    private String firstName;
    private String lasName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
}
