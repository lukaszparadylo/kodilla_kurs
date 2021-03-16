package com.kodilla.testing.shape;

public class Square implements Shape{

    @Override
    public String getShapeName() {

        return getClass().toString();
    }
    @Override
    public Double getField() {
        return (double) hashCode();
    }

    @Override
    public int hashCode() {
        return 200;
    }
}
