import java.util.*;
public class LearnCollectionClass {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(35);
        list.add(36);
        list.add(36);
        list.add(36);
        list.add(37);
        list.add(38);
        list.add(12);
        // System.out.println("min element: " + Collections.min(list));
        // System.out.println("max element: " + Collections.max(list));
        // System.out.println(Collections.frequency(list, 36));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
