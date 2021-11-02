/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 1st, 2021
* This class creates a template for shape creation
* 
*/

public class Shape{
    private String shapeType;

    public Shape(){                             //default constructor

    }

    public Shape(String shapeType){             //shape constructor taking in type attribute
        this.shapeType = shapeType;
    }

    public String typeOfShape(){
        return shapeType;
    }

    public void setShapeType(String shapeType){
        this.shapeType = shapeType;
    }
}