import java.util.*;
public class RecursionPrintFibonacci {
    public static void printFibonacci(int a, int b,int n){
        if(n==0){
            return;
        }
        System.out.print(a);
        printFibonacci(b,a+b,n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(0,1,n);
    }
}
