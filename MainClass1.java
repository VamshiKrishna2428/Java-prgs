import java.io.*;
import java.util.*;
class student
{
 void Display1()
 {
  System.out.println("I am a student");
 }
}
class dept extends student
{
 void Display2()
 {
  System.out.println("I belongs to BSc");
 }
}
class sid extends student
{
 void Display3()
 {
  System.out.println("My id is 056");
 }
}
class MainClass1
{
 public static void main(String args[])
 {
  System.out.println("Calling for subclass C");
  sid s=new sid();
  s.Display1();
  s.Display3();
  System.out.println("Calling for subclass B");
  dept d=new dept();
  d.Display1();
  d.Display2();
 }
}