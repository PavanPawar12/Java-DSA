package access_control;

public class A {
      int num;
    private String name;
    private int[] arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}