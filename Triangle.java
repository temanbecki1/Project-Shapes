/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021
* This class extends TwoDimensionShape.java.
* Adds constructor and methods to interact with a Triangle object
* 
*/

public class Triangle extends TwoDimensionShape{
    private double base;
    private double height;
    final double triangleCal = 0.5;

    public Triangle(String shapeType, double base, double height){
        super(shapeType);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return triangleCal * base * height;
    }

    @Override
    public String toString(){
        return "Area of Triangle is : " + getArea();
    }

    
}
