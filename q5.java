/*Create a LinkedList of type String add 5 elements and traverse the list and from both sides */
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        LinkedList<String> lst1 = new LinkedList<String>();
        lst1.add("Raze");
        lst1.add("Sova");
        lst1.add("Harbor");
        lst1.add("Sage");
        lst1.add("Skye");
        lst1.add("Yoru");
        System.out.println("Traversing the list from front:");
        ListIterator<String> iter = lst1.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("Traversing the list from back:");
        while (iter.hasPrevious()){
            System.out.println(iter.previous());
        }


    }
}
