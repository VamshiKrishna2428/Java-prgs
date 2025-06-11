import java.util.*;
public class CircleAreaCircum {
    public static Double getCircumference(Double radius){
        return 2 * (22/7) * radius;
    }
    public static Double getArea(Double radius){
        return (22/7) * radius * radius;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println("Circumference of circle is:"+getCircumference(radius));
        System.out.println("Area of circle is:"+getArea(radius));
    }

}