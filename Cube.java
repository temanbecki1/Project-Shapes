/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021a
* This class extends ThreeDimensionShape.java.
* Adds constructor and methods to interact with a Cube object
* 
*/


public class Cube extends ThreeDimensionShape{
    private double sideLength;

    public Cube(String shapeType, double sideLength){
        super(shapeType);
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume(){
        return Math.pow(sideLength,3);

    }

    @Override
    public String toString(){
        return "Volume of Cube : " + getVolume();
    }
}
