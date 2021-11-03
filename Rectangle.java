/*
* File : Rectangle.java
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021a
* This class extends TwoDimensionShape.java.
* Adds constructor and methods to interact with a Rectangle object
* 
*/


public class Rectangle extends TwoDimensionShape {
    private double base;
    private double height;

    public Rectangle(String shapeType, double base, double height){
        super(shapeType);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){                                    
        return base * height;                                   //calculates area of 2D rectangle
    }

    @Override
    public String toString(){
            return "Area of Rectangle : " + getArea();          //returns the Area of the rectangle
        }    
}
