import java.util.*;
public class RecursionOccurence {
public static int first = -1;
public static int last = -1;
public static void getIndices(String str, char el, int idx) {
if(idx == str.length()) {
return;
}
if(str.charAt(idx) == el) {
if(first == -1) {
first = idx;
} else {
last = idx;
}
}
getIndices(str, el, idx+1);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str = sc.next();
//String str = "tabcdfghijakkk";
char el = 'a';
getIndices(str, el, 0);
System.out.println("First occurence : " + first);
System.out.println("Last occurence : " + last);
}
}
