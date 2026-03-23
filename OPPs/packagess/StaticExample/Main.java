package packagess.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human pavan = new Human(21, false, "pavan", 30000);
        Human raj = new Human(22, true, "raj", 50000);
        System.out.println(pavan.population);
        System.out.println(raj.population);
        Human.message();

        
    }
}
