/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021a
* This class extends ThreeDimensionShape.java.
* Adds constructor and methods to interact with a Cone object
* 
*/

public class Cone extends ThreeDimensionShape{
    private double radius;
    private double height;
    final double volumeMultiplier = (1.0/3.0);

    public Cone(String shapeType, double radius, double height){
        super(shapeType);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume(){
        return volumeMultiplier * Math.PI * Math.pow(radius,2) * height;
    }

    @Override
    public String toString(){
        return "Volume of Cone : " + getVolume();
    }
}
