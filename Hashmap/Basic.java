

public class Basic {
    public static void  main(String[] args){
        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("Pavan", 12);
        // map.put("Jivam", 13);
        // // System.out.println(map);
        // System.out.println(map.get("Pavan"));
        // System.out.println(map.containsKey("Pavan"));
        // System.out.println(map.remove("Pavan"));
        // System.out.println(map);
        palindrom();

    }
    public static void palindrom(){
        int n = 1234;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev  = rev * 10 + digit;
            n  = n / 10;
        }
        System.out.println(rev);
          
    }
}
