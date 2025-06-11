import java.util.*;
public class RecursionPrintNo {
    public static void printNumber(int n){
        //if(n==0){
            if(n==6){
            return;
        }
        System.out.println(n);
       // printNumber(n-1);
        printNumber(n+1);
    }
    public static void main(String args[]){
       int n = 1; 
       printNumber(n);
    }
}