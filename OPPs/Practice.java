class Student{
    protected  String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + this.name + " and " + " age " + this.age);
    }
}
public class Practice {
    public void display(){
        System.out.println("This is just method");
    }
    public static void main(String[] args){
       Student obj = new Student("pavan", 12);
       Student obj1 = new Student();
       obj1.name = "pavan";
       System.out.println(obj1.name = "Jivan");
       
       obj.display();
       
    }
}
