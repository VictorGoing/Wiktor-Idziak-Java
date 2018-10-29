package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<Shape>();



    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public void removeFigure(Shape shape){
        figures.remove(shape);
    }

    public Shape getFigure(int n){
        if(n>=0 && figures.size()>n)
        return figures.get(n);

        return null;
    }

    public String showFigures(){
        String result = "";
        for(int i = 0; i < figures.size(); i++){
            result = result + figures.get(i).getShapeName();
        }
        return result;
    }

    public List<Shape> getFigures(){
        return figures;
    }
}
