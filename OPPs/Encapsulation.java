class Student{
    private int age;
    public void setAge(int a){
        if(a > 0){
            age = a;
        }else{
            System.out.println("Invalid age");
        }
    }

    public int get(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(2);
        System.out.println(s.get());
        
        

    }
}
