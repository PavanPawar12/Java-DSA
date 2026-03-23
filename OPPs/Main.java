

public class Main {
    public static void main(String[] args) {
        // Student[] students = new Student[5];
        Student pavan = new Student("pavan", 12, 90);
       
        
        // pavan.marks  = 123;
        // pavan.name = "Jivan";
        // pavan.rollno = 12;f
        // pavan.changeName("Prajwal");
        pavan.greeting();  
        // System.out.println(pavan.name);
        // System.out.println(pavan.rollno);
        // System.out.println(pavan.marks);
        Student random = new Student();
        System.out.println(random.rollno);

        Student random1 = new Student();
        System.out.println(random1.marks);

        Student one = new Student();
        Student two = one;

        //more that one intance variable can point to the same object 
        
        one.name = "Something something";
        System.out.println(one.name);
        System.out.println(two.name);
        System.out.println(one.name == two.name);
    }
}

// this is for every single student  
// for single student
class Student{
    String name;
    int rollno;
    float marks;

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }
    void changeName (String newName){
        this.name = newName;
    }
    Student (Student other){
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }
    // we need a way to add the values of the above
    // properties object by object
    // we need one word to access every object
    // Student(){
    //     this.name = "Jivan";
    //     this.rollno = 90;
    //     this.marks = 123;
    // }  

    // you can call constructor from another contructor 
    Student(){

        // this is how you call a contructor from another contructor
        // internally: new Student("default person", 12, 300 );
        this("default person", 12, 300 );
    }
    // Student prajwal will replace with jivan
    Student(String name, int rn, float mrk){
        this.name = name;
        this.rollno  = rn;
        this.marks = mrk;
    }

}
