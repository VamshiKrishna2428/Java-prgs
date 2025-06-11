import java.util.*;
import java.io.*;
public class PrimeOrNot {
    public static boolean printPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
            return false;
            }
            return true;
    }
}
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
           // System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (printPrime(n)) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
    }
}
