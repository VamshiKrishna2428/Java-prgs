import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class STRINGS {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        //int size = sc.nextInt();
        //String array[] = new String[size];
        String str = sc.next();
        String result = " ";
        /*int sum=0,totalLength = 0;
        for(int i=0;i<size;i++){
            array[i]=sc.next();
            totalLength+= array[i].length();
        }
        for(int i=0;i<=size;i++){
            sum=sum+i;
        }*/
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='i'){
                result += 't';
            }else{
                result += str.charAt(i);
            }
        }
        //System.out.println(totalLength);
        //System.out.println(sum);
        System.out.println(result);
    }
    
}
