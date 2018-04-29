package com.vpaveldm.entity;

import lombok.Data;

@Data
public class Standard {
    private String name;
    private String land;

    public Standard() {
    }

    public Standard(String name, String land) {
        this.name = name;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
