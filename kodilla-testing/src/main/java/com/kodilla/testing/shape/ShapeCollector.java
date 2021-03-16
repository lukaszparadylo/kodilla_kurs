package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        this.figures.add(shape);
    }
    public boolean removeFigure(Shape shape){
        if(this.figures.size()>0) {
            this.figures.remove(shape);
            return true;
        }
        else {
            return false;
        }
    }
    public Shape getFigure(int n){
        if(this.figures.size()>n) return this.figures.get(n);
        else return (Shape) new Object();
    }
    public boolean showFigures(){
        if(this.figures.size()>0){
            for (Shape i : this.figures){
                System.out.println(i.getShapeName()+ " "+ i.getField());
            }
            return true;
        }
        else return false;
    }
}
