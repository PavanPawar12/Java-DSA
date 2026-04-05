import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();     
        // Set<Integer> set = new LinkedHashSet<>(); // order mainain


        // Set<Integer> set = new TreeSet<>();
        // set.add(23);
        // set.add(2);
        // set.add(54);
        // set.add(56);
        // System.out.println(set);

        // set.remove(56);
        // System.out.println(set);

        // System.out.println(set.contains(54));

        // System.out.println(set.isEmpty());

        // System.out.println(set.size());
        
        // set.clear();
        // System.out.println(set);


        Set<Student> studentset = new TreeSet<>();
        studentset.add(new Student("Pavan", 21));
        studentset.add(new Student("Ramesh", 22));
        studentset.add(new Student("Shivam", 23));
        studentset.add(new Student("Rohit", 24));

        System.out.println(studentset);
        
        }
}
