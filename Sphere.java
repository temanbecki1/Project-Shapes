/*
* File : Sphere.java
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021a
* This class extends ThreeDimensionShape.java.
* Adds constructor and methods to interact with a Sphere object
* 
*/




public class Sphere extends ThreeDimensionShape{    
    private double radius;                                                      //declares radius
    final double volumeMultiplier = (4.0/3.0);                                  //used in volume formula for sphere

    public Sphere(String shapeType, double radius){
        super(shapeType);
        this.radius = radius;
    }

    @Override
    public double getVolume(){
        return volumeMultiplier * Math.PI * (Math.pow(radius,3));               //calculates volume of sphere
    }

    @Override
    public String toString(){
        return "Volume of Sphere : " + getVolume();
    }
    
}
