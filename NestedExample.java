import java.io.*;
import java.util.*;
public class NestedExample
{
 public static void main(String args[])
 {
  int a,b,c;
  a=7; 
  b=8;
  c=9;
  if(a>b)
  {
   if(a>c)
   {
    System.out.println("a is greater");
   }
   else
   {
    System.out.println("c is greater");
   }
  }
  else
  {
   if(b>c);
   {
    System.out.println("b is greater");
   }
   else
   {
    System.out.println("c is greater");
   }
  }
 }
}