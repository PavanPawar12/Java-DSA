package access_control;

public class ObjectDemo {
    int num;
    float gpa;
    
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }


    @Override
    public String toString() {  // it just gives string representation 
        return super.toString();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj);
        return this.num = ((ObjectDemo)obj).num;
        
    }

    @Override
    public int hashCode() {
        return super.hashCode();  // it just gives random integer number 
        // return num;
    }

    // @Override 
    // protected void finalize() throws Throwable { // when garbage collection hit
    //     super.finalize();
    // }
    
    public static void main(String[] args) {
       ObjectDemo obj1 = new ObjectDemo(34,34.4f);
       ObjectDemo obj2 = new ObjectDemo(12,74.4f);

       if(obj1  == obj2){
            System.out.println("obj1 is equal to obj2");
       }
       if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
       }

    //    System.out.println(obj.hashCode());
    //    System.out.println(obj1.hashCode());

    }
}
