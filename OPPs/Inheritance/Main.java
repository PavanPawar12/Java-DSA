package Inheritance;

public class Main {
   public static void main(String[] args) {
        Box box1 = new Box(1,2,3);
        // Box box2 = new Box(box1);
        // BoxWeight box3 = new BoxWeight();
        
        // System.out.println(bw.h + " " + bw.weight);
        // BoxWeight box4 = new BoxWeight(1,2,3,4);
        // System.out.println(box3.h + " " + box3.weight);

      //   Box box5 = new BoxWeight(2,3,4,8);
      //   System.out.println(box5.h);

      //   BoxWeight box6 = new BoxWeight(1,2,3,4);
      //   System.out.println(box6.weight);

       // there are many variables in both parent and child classes
      // you are given access to variables that are in the ref type i.e BoxWeight
      // hence, you should have access to weight variable
      // this also means, that the ones you are trying to access should be initialised
      // but here, when the obj itself is of type parent class, how willl you cal the
      // this is why error

      // BoxPrice box7 = new BoxPrice(8,12,4000);
      // System.out.println(box7.cost);

      // BoxColor box8 = new BoxColor();
      // box8.info(); 

      // Box.greeting();  // we can do using class name also 
      
      Box box = new BoxWeight();
      box.greeting();
   }
}
