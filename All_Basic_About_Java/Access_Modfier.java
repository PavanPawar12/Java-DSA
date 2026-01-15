
class C1{
    public int a = 23;
    private int b = 24;
    int c = 16;
    protected int d = 3;

    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Access_Modfier {
    public static void main(String[] args) {
            C1 c = new C1();
            System.out.println(c.a);
            // System.out.println(c.b);
            System.out.println(c.c);
            System.out.println(c.d);

    }

}
