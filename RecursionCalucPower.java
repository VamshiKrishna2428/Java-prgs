import java.util.*;
public class RecursionCalucPower {
    public static int CalcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
       /*  int xpownm1 = CalcPower(x,n-1);
        int xpown = x * xpownm1;
        return xpown; */
        if(n%2==0){ // n is even
            return CalcPower(x,n/2)*CalcPower(x,n/2);
        }
        else{ // n is odd
            return CalcPower(x,n/2)*CalcPower(x,n/2)*x;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int x = 3, n = 4;
        System.out.println("Enter the values of x and n:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = CalcPower(x,n);
        System.out.println("The x power n is:"+ans);
    }
}
