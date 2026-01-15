class Programmer{
    private  String name;

    // getter method is used to get the data
    public String getName(){
        return name;
    }
    // setter mathod is used to set the method
    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Pavan");
        System.out.println("Name => " + p.getName());
    }
    
}
