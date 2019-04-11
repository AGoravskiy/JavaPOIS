/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsu.model.entity;

import java.io.Serializable;

public class Transport implements Serializable{
    private double carrying;
    private double seating;
    private double maxRange;

    public Transport() {
    }

    public Transport(double carrying, double seating, double maxRange) {
        this.carrying = carrying;
        this.seating = seating;
        this.maxRange = maxRange;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public double getSeats() {
        return seating;
    }

    public void setSeating(double seating) {
        this.seating = seating;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    @Override
    public String toString() {
        return "Transport{" + "carrying=" + carrying + ", seating=" + seating + ", maxRange=" + maxRange + '}';
    }
    
}
