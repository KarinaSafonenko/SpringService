package com.vpaveldm.entity;

import org.springframework.stereotype.Component;

@Component
public class LocalNetwork {
    private String name;
    private String cable;
    private int speed;
    private Standard standard;
    private int id;

    public LocalNetwork() {
    }

    public LocalNetwork(int id, String name, String cable, int speed, Standard standard) {
        this.name = name;
        this.cable = cable;
        this.speed = speed;
        this.standard = standard;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
