/*Create a class Customer(Account_no Integer, Name Sting), Create a HashMap of type Customer put elements, 
print elements, check if element with account number 101 is present or not? What is the value for Customer 101.
 */

import java.util.*;

class Customer{
    Integer accountNumber;
    String name;
    
    public Customer(Integer accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;

    }

    public void print(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
    }


}


public class q7 {
    public static void main(String[] args) {
            HashMap<Integer,Customer> customerhashmap = new HashMap<>();
            (customerhashmap).put(101, new Customer(101, "Goku"));
            (customerhashmap).put(102, new Customer(102, "Eren"));
            (customerhashmap).put(103, new Customer(103, "Naruto"));
            (customerhashmap).put(104, new Customer(104, "Ichigo"));

            for (Integer key:customerhashmap.keySet()){
                customerhashmap.get(key).print();

            }
            if (customerhashmap.containsKey(101)){
                System.out.println("Element found printing the value...");
                customerhashmap.get(101).print();
            }
            else{
                System.out.println("Element not found ...");
            }

        }
}

