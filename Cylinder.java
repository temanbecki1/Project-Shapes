/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021a
* This class extends ThreeDimensionShape.java.
* Adds constructor and methods to interact with a Cylinder object
* 
*/

public class Cylinder extends ThreeDimensionShape{
    private double radius;                                              //declares radius
    private double height;                                              //declares height

    public Cylinder(String shapeType, double radius, double height){
        super(shapeType);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume(){
        return Math.PI * radius * radius * height;                      //calculates the volume of a cylinder
    }

    @Override
    public String toString(){
        return "Volume of Cylinder : " + getVolume();
    }
    
}
