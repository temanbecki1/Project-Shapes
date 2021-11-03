import java.util.Scanner;

/*
* File : Main.java
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 2nd, 2021
* This class contains the main method. It will serve as controller for application interaction
*
*/



public class Main {
    private static String shapeType;

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String radius;
        String base;
        String height;
        String minorRadius;

        while(true){
            System.out.println("********************** Welcome to the Java OO Shapes Program *************************");
            System.out.println();
            System.out.println("Press number option on keypad to select from the menu below :");
            System.out.println();
            System.out.println("1. Construct a Circle");
            System.out.println("2. Construct a Rectangle");
            System.out.println("3. Construct a Triangle");
            System.out.println("4. Construct a Square");
            System.out.println("5. Construct a Sphere");
            System.out.println("6. Construct a Cube");
            System.out.println("7. Construct a Cone");
            System.out.println("8. Construct a Cylinder");
            System.out.println("9. Construct a Torus");
            System.out.println("0. Exit the program");
            System.out.println();

            String userSelection = scanner.next();
            switch(userSelection){
                case "1":
                System.out.println("You have selected a Circle");
                shapeType = "Circle";                                                                                                   //assigns Circle to shapeType
                System.out.println("What is the radius?");
                radius = scanner.next();                                                                                                //assigns next user input to radius String
                
                if(isNumeric(radius)){                                                                                                  //boolean to check syntax of userinput radius
                    Circle myCircle = new Circle(shapeType, Double.parseDouble(radius));                                                //creates new circle object
                    System.out.println("The area of this " + shapeType + " is " + String.format("%.2f", myCircle.getArea()));           //formats and prints to screen the Area of circle
                } else {
                    System.out.println("You have entered an invalid radius.");
                }
                break;

                case "2":
                System.out.println("You have selected a Rectangle");
                shapeType = "Rectangle";
                System.out.println("What is the base?");
                base = scanner.next();
                System.out.println("What is the height?");
                height = scanner.next();

                if(isNumeric(base) && isNumeric(height)){
                    Rectangle myRectangle = new Rectangle(shapeType, Double.parseDouble(base), Double.parseDouble(height));
                    System.out.println("The area of this " + shapeType + " is " + String.format("%.2f", myRectangle.getArea()));
                } else {
                    System.out.println("You have entered an invalid base or height.");
                }
                break;

                case "3":
                System.out.println("You have selected a Triangle");
                shapeType = "Triangle";
                System.out.println("What is the base?");
                base = scanner.next();
                System.out.println("What is the height?");
                height = scanner.next();

                if(isNumeric(base) && isNumeric(height)){
                    Triangle myTriangle = new Triangle(shapeType, Double.parseDouble(base), Double.parseDouble(height));
                    System.out.println("The area of this " + shapeType + " is " + String.format("%.2f", myTriangle.getArea()));
                } else {
                    System.out.println("You have entered an invalid base or height.");
                }
                break;

                case "4":
                System.out.println("You have selected a Square");
                shapeType = "Square";
                System.out.println("What is the side length?");
                base = scanner.next();
                
                if(isNumeric(base)){
                    Square mySquare = new Square(shapeType, Double.parseDouble(base));
                    System.out.println("The area of this " + shapeType + " is " + String.format("%.2f", mySquare.getArea()));
                } else {
                    System.out.println("You have entered an invalid base or height.");
                }
                break;

                case "5":
                System.out.println("You have selected a Sphere");
                shapeType = "Sphere";
                System.out.println("What is the radius?");
                radius = scanner.next();                                                                                                    //assigns next user input to radius String
                
                if(isNumeric(radius)){                                                                                                      //boolean to check syntax of userinput radius
                    Sphere mySphere = new Sphere(shapeType, Double.parseDouble(radius));                                                    //creates new sphere object
                    System.out.println("The volume of this " + shapeType + " is " + String.format("%.2f", mySphere.getVolume()));           //formats and prints to screen the Volume of the Sphere
                } else {
                    System.out.println("You have entered an invalid radius.");
                }
                break;

                case "6":
                System.out.println("You have selected a Cube");
                shapeType = "Cube";
                System.out.println("What is the side length?");
                base = scanner.next();
                
                if(isNumeric(base)){
                    Cube myCube = new Cube(shapeType, Double.parseDouble(base));
                    System.out.println("The volume of this " + shapeType + " is " + String.format("%.2f", myCube.getVolume()));
                } else {
                    System.out.println("You have entered an invalid base or height.");
                }
                break;

                case "7":
                System.out.println("You have selected a Cone");
                shapeType = "Cone";
                System.out.println("What is the radius?");
                radius = scanner.next();
                System.out.println("What is the height?");
                height = scanner.next();

                if(isNumeric(radius) && isNumeric(height)){
                    Cone myCone = new Cone(shapeType, Double.parseDouble(radius), Double.parseDouble(height));
                    System.out.println("The volume of this " + shapeType + " is " + String.format("%.2f", myCone.getVolume()));
                } else {
                    System.out.println("You have entered an invalid radius or height.");
                }
                break;

                case "8":
                System.out.println("You have selected a Cylinder");
                shapeType = "Cylinder";
                System.out.println("What is the radius?");
                radius = scanner.next();
                System.out.println("What is the height?");
                height = scanner.next();

                if(isNumeric(radius) && isNumeric(height)){
                    Cylinder myCylinder = new Cylinder(shapeType, Double.parseDouble(radius), Double.parseDouble(height));
                    System.out.println("The volume of this " + shapeType + " is " + String.format("%.2f", myCylinder.getVolume()));
                } else{
                    System.out.println("You have entered an invalid radius or height.");
                }
                break;

                case "9":
                System.out.println("You have selected a Torus");
                shapeType = "Torus";
                System.out.println("What is the major radius?");
                radius = scanner.next();
                System.out.println("What is the minor radius?");
                minorRadius = scanner.next();

                if(isNumeric(radius) && isNumeric(minorRadius)){
                    Torus myTorus = new Torus(shapeType, Double.parseDouble(minorRadius), Double.parseDouble(radius));
                    System.out.println("The volume of this " + shapeType + " is " + String.format("%.2f", myTorus.getVolume()));
                } else{
                    System.out.println("You have entered an invalid major or minor radius.");
                }
                break;


                case "0":
                java.util.Date date = new java.util.Date();
                System.out.println("Thank you! The current date is " + date + ". The program will now exit");
                scanner.close();
                System.exit(0);
                break;
                default:
                System.out.println("You have entered an invalid option");
            }
        }
    } 
    
    public static boolean isNumeric(String test){
        if(test == null){
            return false;
        }
        try{
            Double.parseDouble(test);
            return true;
        } catch(NumberFormatException nfe){
            return false;
        }
        //return true;
    }
}
