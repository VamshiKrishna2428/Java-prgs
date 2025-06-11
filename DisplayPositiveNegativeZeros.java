import java.util.*;


public class DisplayPositiveNegativeZeros{
   public static void main(String args[]){
    int positives = 0,negatives = 0,zeros = 0;
    System.out.println("press 1 to continue & 0 to stop");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    while(input == 1){
        System.out.println("Enter number:");
        int number = sc.nextInt();
        if(number > 0){
            positives ++;
        }else if(number < 0){
            negatives ++;
        }else{
            zeros ++;
        }

        System.out.println("press 1 to continue & 0 to stop");
        input = sc.nextInt();

        System.out.println("positives:"+positives);
        System.out.println("negatives:"+negatives);
        System.out.println("zeros:"+zeros);
    }

    }
}
