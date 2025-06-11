import java.util.*;
public class TwoDArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] n = new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                n[i][j]=sc.nextInt();
            }
        }
            int x = sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                if(n[i][j]==x){
                    System.out.println("X found at ("+ i +","+ j +")");
                }else {
                    System.out.println("X not found");
                }
            }
        }
    }
}