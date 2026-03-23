class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dot extends Animal{
    void bark(){
        System.out.println("Dot is barking");
    }
}
public class Single {
   public static void main(String[] args){
    Dot d = new Dot();
    d.eat(); 
    d.bark(); 
   } 
}
