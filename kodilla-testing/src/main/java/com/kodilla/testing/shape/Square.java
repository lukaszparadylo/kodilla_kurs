package com.kodilla.testing.shape;

public class Square implements Shape{
    private Double squareField;
    Square(Double a){
        this.squareField = a * a;
    }
    @Override
    public String getShapeName() {

        return getClass().toString();
    }
    @Override
    public Double getField() {
        return squareField;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}
