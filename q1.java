/*Q1.Implement bounded types (implements an interface) with generics. Create a Interface shape with method Area() create Circle and Square which implements Class Shape.Create a generic class BoundedShape that extends shape. And implement the generics and use area function accordingly
 */

interface Shape {
    double getArea();
    
}
class circle implements Shape{
    private final double radius;
    public circle(double radius){
        this.radius=radius;
    }
    public double getArea( ){
        return radius*radius*Math.PI;
    }

}
class square implements Shape{
    private final double side;
    public square(double side){
        this.side=side;
    }
    public double getArea( ){
        return side*side;
    }

}

public class q1{
    public static void main(String[] args) {
        Shape s1=new circle(10.0);
        Shape s2=new square(10.0);
        System.out.println("Area of circle is : " + s1.getArea());
        System.out.println("Area of square is : " + s2.getArea());
    }
}

