package com.mike.microservices.limitsservice.bean;

import org.springframework.context.annotation.Bean;


public class LimitsConfiguration {
    private int minimum;
    private int maxium;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaxium() {
        return maxium;
    }

    public void setMaxium(int maxium) {
        this.maxium = maxium;
    }

    public LimitsConfiguration(int minimum, int maxium) {
        super();
        this.minimum = minimum;
        this.maxium = maxium;
    }

    public LimitsConfiguration() {
    }
}
