/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021a
* This class extends ThreeDimensionShape.java.
* Adds constructor and methods to interact with a Torus object
* 
*/


public class Torus extends ThreeDimensionShape{
    private double majorRadius;
    private double minorRadius;

    public Torus(String shapeType, double minorRadius, double majorRadius){
        super(shapeType);
        this.minorRadius = minorRadius;
        this.majorRadius = majorRadius;
    }

    @Override
    public double getVolume(){
        return 2 * Math.pow(Math.PI,2) * majorRadius * Math.pow(minorRadius,2);
    }

    @Override
    public String toString(){
        return "Volume for Torus : " + getVolume();
    }
    
}
