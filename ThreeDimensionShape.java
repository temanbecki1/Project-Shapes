/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021
* This abstract class extends Shape.java, adding method to obtain volume for 3D-shapes
* 
*/



public abstract class ThreeDimensionShape extends Shape{
    ThreeDimensionShape(String shapeType){
        super(shapeType);
    }

    public abstract double getVolume();
    
}
