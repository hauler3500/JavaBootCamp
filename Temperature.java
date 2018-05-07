package com.company;

public class Temperature {
    private double far;
    private double cel;
    private double kel;

    public Temperature(double deg){
        setFar(deg);
    }

    public Temperature(){
        setFar(0.0);
    }

    public void setFar(double deg){
        far = deg;
        cel = (deg -32) * 5.0 / 9.0;
        kel = cel + 273.15;
    }

    public void setCel(double deg){
        cel = deg;
        far = (deg * 1.8) + 32;
        kel = deg + 273.15;
    }

    public void setKel(double deg){
        kel = deg;
        far = 1.8 * (deg - 273.15) + 32;
        cel = deg - 273.15;
    }

    public double getCel(){
        return this.cel;
    }

    public double getkel(){
        return this.kel;
    }

    public double getFar(){
        return this.far;
    }

}
