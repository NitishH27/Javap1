/*Q2. Create Generic class , contains array of generic type, write a method to calculate average of the members of the array,
 write a method to check whether the average of  array of different object  is equal or not.
 */
class Generic <T extends Number>{
    T[] t;
    public Generic(T[] t){
        this.t = t;
    }
    public double getAverage() {
        double sum = 0;
        for(T num:t){
            sum = sum + num.doubleValue();
        }
        return sum/this.t.length;
    }
}
public class q2 {
    public static void main(String[] args) {
        Integer[] Inumbers = new Integer[] {1,2,3,4,5,6,7,8};
        Double [] Dnumbers = new Double[] {1.2,2.2,3.4,4.5,5.6,6.7};

        Generic<Integer> getInt = new Generic(Inumbers);
        Generic<Double> getDouble = new Generic(Dnumbers);

        System.out.println("Integer Array Average is: " +Double.toString(getInt.getAverage()));
        System.out.println("Double Array Average is: " +Double.toString(getDouble.getAverage()));
        System.out.println("Both Integer and Double Array are: " +(getInt.getAverage()==getDouble.getAverage()?"Equal":"Not Equal"));
}
}