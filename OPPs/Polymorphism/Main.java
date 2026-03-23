package Polymorphism;

import access_control.A;

public class Main {
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        // Shapes circle = new Circle();
        // Square square = new Square();
        // Triangle triangle = new Triangle();
        // circle.area();

        A obj = new A(12, "pavan");
        //  Access data members
        System.out.println("Num: " + obj.getNum());
        System.out.println("Name: " + obj.getName());
        int n = obj.num;
        

        
    }
}
