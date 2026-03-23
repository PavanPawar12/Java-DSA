package packagess.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello World");
    }

    public Human(int age, boolean married, String name, int salary) {
        this.age = age;
        this.married = married;
        this.name = name;
        this.salary = salary;
        this.population += 1;
    }



    
}
