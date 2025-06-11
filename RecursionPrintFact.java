import java.util.*;
public class RecursionPrintFact {
    public static void printFact(int n,int fact)    {
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
        printFact(n-1,fact);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFact(n,1);
    }
}
