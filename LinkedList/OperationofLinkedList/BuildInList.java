import java.util.*;
public class BuildInList {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());

        // print linked list like a real linked list
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        
    }
}
