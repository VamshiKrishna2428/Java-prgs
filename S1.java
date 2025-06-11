import java.io.*;
class P
{
 public void show()
 {
  System.out.println("Good Morning");
 }
}
class Q extends P
{
 public void show()
 {
  System.out.println("Good Afternoon");
 }
}
class R extends P
{
 public void show()
 {
  System.out.println("Good Evening");
 }
}
public class S1 extends Q
{
 public void show()
 {
   System.out.println("Good Night");
 }
 public static void main(String args[])
 {
  S1 o=new S1();
  o.show();
 }
}