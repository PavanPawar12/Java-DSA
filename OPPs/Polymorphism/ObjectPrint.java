public class ObjectPrint extends Object {

    int nums;

    public ObjectPrint(int nums) {
        this.nums  = nums;
    }

    
    public String toString(){
        return "ObjectPrint{" +
            "num=" + nums +
            "}";
    }
    public static void main(String[] args){
        ObjectPrint  obj = new ObjectPrint(12);
        System.out.println(obj);
    }
}
