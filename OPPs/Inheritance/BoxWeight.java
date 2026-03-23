package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    // @Override
    static void greeting(){
        System.out.println("Hey, am BoxWeight class. Greeting");
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    
    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
        
    public BoxWeight(double l, double h, double w, double weight){
        super(l,h, w); // w hat is this? call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;
    }
    
    
    
}

