package com.mongo.realestate.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Land")
public class Land {

    @Id
    private String id;
    private String landAddress;
    private String landArea;

    public Land() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLandAddress() {
        return landAddress;
    }

    public void setLandAddress(String landAddress) {
        this.landAddress = landAddress;
    }

    public String getLandArea() {
        return landArea;
    }

    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }
}
