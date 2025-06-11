import java.io.*;
public class Overloading 
{
 public static int multiply(int x,int y)
 {
  return x*y;
 }
 public static double multiply(double x,double y);
 {
  return x*y;
 }
 public static double multiply(int x,double y);
 {
  return x*y;
 }
 public static double multiply(double x,int y);
 {
  return x*y;
 }
 public static int multiply(int x)
 {
  return x;
 }
 public static void main(String args[])
 {
  System.out.println(multiply(10,20));
  System.out.println(multiply(10.0,20.0));
  System.out.println(multiply(10,20.0));
  System.out.println(multiply(10.0,20));
  System.out.println(multiply(20));
 }
} 