import java.util.*;
public class Vote {
    public static boolean isEligible(int age){
        if (age>18){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligible(age));
    }
    
}
