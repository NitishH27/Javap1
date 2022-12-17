/* Create an ArrayList of type Integer, add element into it  traverse the arraylist  and print the elements */

import java.util.*;

public class q4{
    public static void main(String[] args) {
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        System.out.println("Adding elements 1 to 10 in an array");
        for (int i = 1; i <= 10; i++) {
            lst1.add(i);
        
        }
        System.out.println("Traversing elements of array: ");
        for(Integer elem:lst1){
            System.out.println(elem);
        }

}
}
