package access_control;
public class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(12, "pavan");
        int n = obj.num;
    }
    
}