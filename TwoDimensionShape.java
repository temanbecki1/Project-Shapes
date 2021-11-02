/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021
* This abstract class extends Shape.java, adding method to obtain area from 2D-shapes
* 
*/


public abstract class TwoDimensionShape extends Shape{
    TwoDimensionShape(String shapeType){
        super(shapeType);
    }

    public abstract double getArea();
    
}
