import java.util.Scanner;

/*
* Author : Teman Beck
* CMSC 335 Project 1 Shapes
* Date : November 2nd, 2021
* This class contains our main method. It will serve as controller for application interaction
*
*/



public class Main {
    private static String shapeType;

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String radius;

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
                shapeType = "Circle";
                System.out.println("What is the radius?");
                radius = scanner.next();                    //assigns next user input to radius String
                
                if(isNumeric(radius)){
                    Circle myCircle = new Circle(shapeType, Double.parseDouble(radius));
                    System.out.println("The area of this " + shapeType + " is " + String.format("%.2f", myCircle.getArea()));
                } else {
                    System.out.println("You have entered an invalid radius.");
                }

                break;
                case "2":
                System.out.println("You have selected a Rectangle");
                break;
                case "3":
                System.out.println("You have selected a Triangle");
                break;
                case "4":
                System.out.println("You have selected a Square");
                break;
                case "5":
                System.out.println("You have selected a Sphere");
                break;
                case "6":
                System.out.println("You have selected a Cube");
                break;
                case "7":
                System.out.println("You have selected a Cone");
                break;
                case "8":
                System.out.println("You have selected a Cylinder");
                break;
                case "9":
                System.out.println("You have selected a Torus");
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
        } catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
