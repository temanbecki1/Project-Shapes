/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021
* This class extends TwoDimensionShape.java.
* Adds constructor and methods to interact with a Circle object
* 
*/


public class Circle extends TwoDimensionShape {
    private double radius;

    public Circle(String shapeType, double radius){
        super(shapeType);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return "Area of Circle : " + getArea();
    }
}
