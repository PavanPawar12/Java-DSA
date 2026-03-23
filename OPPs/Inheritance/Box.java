package Inheritance;

public  class Box {
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey i am greeting, this is box class ");
    }

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    
    Box(Box old){
        this.l = old.l;
        this.h= old.h;
        this.w = old.w;
    }


//    public static void main(String[] srgs){
//      Box box = new Box();
//     System.out.println(box.l +" " + box.h +" " + box.w);
//    } 


}
