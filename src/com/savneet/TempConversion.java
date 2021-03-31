package com.savneet;

import javax.swing.*;

public class TempConversion {
    private double speed;
    private double temperature;

    public TempConversion(double speed, double temperature) {
        this.speed = speed;
        this.temperature = temperature;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double feelsLikeTemperature()
    {
        return this.speed *this.temperature;
    }
}
