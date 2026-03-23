class Node{
    int data;
}
class Student{
    String name;
    int age;
    String course;

    
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    void greet(){
        System.out.println("Welcome pavan");
    }
    void numberCheck(int n){
        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    
}

class Car{
    String brand;
    int price;

    Car(String b, int p) {
        this.brand = b;
        this.price = p;
    }
    void diplay(){
        System.out.println("Brand name: " + this.brand +" price: " + this.price);
    }

}
public class ClassObject{
   public static void main(String[] args){
    Student s1 = new Student();
    s1.name = "Pavan";
    s1.age = 31;
    s1.course = "python";

    Student s2 = new Student();
    s2.name = "jivan";
    s2.age = 32;
    s2.course = "java";

    System.out.println("Subject: "+ s1.name + " Age: " + s1.age + " Course: " + s1.course);
    System.out.println("Subject: "+ s2.name + " Age: " + s2.age + " Course: " + s2.course);


    Node n1 = new Node();
    n1.data = 10;

    Node n2 = new Node();
    n2.data = 20;
    System.out.println(n1.data);
    System.out.println(n2.data);

    System.out.println("---------------------------------------------------------------------------------------------");

    Calculator c = new Calculator();
    c.greet();
    c.numberCheck(5);
    System.out.println(c.sum(12, 12));

    System.out.println("---------------------------------------------------------------------------------------------");

    Car car = new Car("tata", 1200000);
    car.diplay();
    System.out.println(car.price);
   }
}
