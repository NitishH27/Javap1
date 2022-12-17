/*. Create an employee class (id, name, salary) create an Arralist of type employee, add 5 employee, 
traverse the ArrayList and print the elements, Remove one element and print the list */

import java.util.*;

class Employee{
    Integer id;
    String name;
    Double salary;
    
    public Integer getId() {
        return id;
}
    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
    public void print() {
        System.out.println("Employee id: " + this.getId().toString()); 
        System.out.println("Employee Name: " + this.getName().toString());
        System.out.println("Employee Salary " + this.getSalary().toString());
    }
public class q6 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        for(int i=1; i<=5;i++) {
            empList.add(new Employee(1, "Name"+ Integer.toString(i),(Double)(i*1000.0)));
        }
        System.out.println("Traversing List: ");
        for(Employee e: empList){
            e.print();
        }
        System.out.println("Removing First employee:");
        empList.remove(0).print();

        System.out.println("Traversing list again to check the changes:");
        for(Employee e: empList){
            e.print();
        }
    }
}    

}
