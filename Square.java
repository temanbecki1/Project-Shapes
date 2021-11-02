/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021
* This class extends Rectangle.java.
* Overwrites toString()
* Square is-a Rectangle, however, rectangles may NOT be squares
* 
*/



public class Square extends Rectangle{
    public Square(String shapeType, double sideLength){
        super(shapeType, sideLength, sideLength);                       //calls super class rectangles constructor with square inputs
    }

    @Override
    public String toString(){
        return "Area of Square : " + super.getArea();                   //returns the Area of the Square object via super implementation
    } 
}
