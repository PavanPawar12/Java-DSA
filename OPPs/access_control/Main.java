package access_control;
    
public class Main {
    public static void main(String[] args){
        A obj = new A(10, "pavan");

        //  Access data members
        System.out.println("Num: " + obj.getNum());
        System.out.println("Name: " + obj.getName());
        int n = obj.num;
        System.out.println(n);
       // need to do new things
       // 1. access the data member
       // 2. modify the data member

       
    }
}
