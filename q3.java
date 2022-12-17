/*Perform addition, subtraction, multiplication as well as division using Lambda Expression
 */

interface Calculation <T extends Number>{
    T getResult();
}


public class q3 {
    public static void printOperation(String op, Calculation c){
        System.out.println("Operation of "+op+" "+ "gives us "+c.getResult());
    }
    public static void main(String[] args) {
        Integer op1 = 12;
        Integer op2 = 8;
        printOperation("Add", ()-> op1+op1);
        printOperation("Sub", ()-> op1-op2);
        printOperation("Mul", ()-> op1*op1);
        printOperation("Div", ()-> op1/op1);    
        
    }
    
}
