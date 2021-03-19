package com.kodilla.testing.shape;

public class Circle implements Shape{
    private Double circleField;
    Circle(Double r){
        this.circleField = Math.PI*r*r;
    }
    @Override
    public String getShapeName() {
        return getClass().toString();
    }
    @Override
    public Double getField() {
        return circleField;
    }
    @Override
    public int hashCode() {
        return 100;
    }
}
