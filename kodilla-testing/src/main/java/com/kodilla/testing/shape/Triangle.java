package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private Double triangleField;
    Triangle(Double a, Double h){
        this.triangleField = a * 0.5*h;
    }
    @Override
    public String getShapeName() {
        return getClass().toString();
    }

    @Override
    public Double getField() {
        return triangleField;
    }

    @Override
    public int hashCode() {
        return 300;
    }
}
