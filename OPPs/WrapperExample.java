public class WrapperExample {
    public static void main(String[] args) {
        int num = 10;
        Integer a = num;
        System.out.println("Wrapper: "+a);

        final A pavan = new A("Pavan Pawar");
        pavan.name = "jivan";
        //when a not primitive is final, you connot reassign it.
        // pavan = new A("new object");
        A obj;
        System.out.println(obj);
        for (int i = 0; i < 10000; i++) {
            obj = new A("GArbage colletion");
        }
    }
}
class A{
    final int num = 10;
    String name;

    A(String name){
        this.name = name;
    }

}