class Test{
    private int balance = 50000;

    public void showbalance(){
        System.out.println("Balance is: " + balance);

    }
}

public class Bank {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.showbalance();
    }
}
