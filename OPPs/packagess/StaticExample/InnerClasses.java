package packagess.StaticExample;

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Pavan");
        Test b = new Test("Sharvil");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
