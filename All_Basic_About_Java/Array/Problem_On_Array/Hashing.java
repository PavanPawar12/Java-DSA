
import java.util.HashSet;

public class Hashing {
    public static void main(String[] args){
        // TreeMap <String,Integer> map = new TreeMap<>();
        // map.put("Pavan", 90);
        // map.put("Jivan", 91);
        // map.put("karan", 92);
        // // System.out.println(map.containsKey("Jivan"));
        // System.out.println(map);

        // HashSet <Integer>  set = new HashSet<>();
        // set.add(12);
        // set.add(13);
        // set.add(13);
        // set.add(14);  // it is not stored duplicated
        // System.out.println(set);

        // System.out.println(set.remove(12));
        // System.out.println(set);


        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        HashSet<Integer>  set = new HashSet<>();
        // HashSet<Integer> duplicate = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(i)){
                System.out.println("Duplicated : " + i);
            }
        }
        System.out.println("Duplicated: " + set);
    }    
}
