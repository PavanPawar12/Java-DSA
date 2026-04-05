// ArrayList

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        // String[] student = new String[20];
        // student[0] = "pavan";
        // student[12  ] = "Jivan";
        // student[21] = "rao";
        // System.out.println(student[0]);

        // ArrayList<String> student = new ArrayList<>();
        // student.add("Pavan");
        /*
         
        List<Integer> list = new ArrayList();
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);
        list.add(15);  // this will add 15 at the end of list
        System.out.println(list);

        list.add(1,50); // This will add 50 at index 1
        System.out.println(list);


        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(151);
        list.addAll(newList);   // This will add all the element 
        System.out.println(list);

        System.out.println(list.get(1));

        */

        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        System.out.println(list);

        // using for Loop
        for(int i = 0; i < list.size(); i++){
            // System.out.println("The element is: " + list.get(i));
        }

        // using foreach loop
        for(Integer element : list){
            System.out.println("element is: " + element);
        }

        // using iterator while loop
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("iterator: " + it.next());
        }



        // list.set(2, 1000);    // Time complexity of this O(1) it direclty update

        // System.out.println(list);

        // System.out.println(list.contains(1000));

        // list.remove(1);  // This will remove index 1 element
        // System.out.println(list); 

        // list.remove(Integer.valueOf(14)); // This will remove element not using index
        // System.out.println(list);

        // list.clear();  // This will remove all the elements from the list
        // System.out.println(list);
        
    }  
}
