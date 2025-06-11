import java.util.*;
public class Strings1 {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("tony");
     //Insert char
     sb.insert(0, 'S');
     System.out.println(sb);


	//delete char
     sb.delete(0, 1);
     System.out.println(sb);
      
  // set and get a char
  //   sb.setcharAt(0,'m');
  //   System.out.println(sb);
        System.out.println(sb.charAt(2));

  // Append and get length
      sb.append("stark");
      System.out.println(sb);
      System.out.println(sb.length());
   }
}