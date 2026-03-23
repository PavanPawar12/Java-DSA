package Polymorphism;

public class Circle extends Shapes {
    
    // this will run when object of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation    --> it is for just checking purpose 
    void area(){
        System.out.println("Area of cirlce  is : pie * r * r");
    }
}
