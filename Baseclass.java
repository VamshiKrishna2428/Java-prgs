import java.io.*;
import java.util.*;
abstract class Baseclass2
{
 abstract void display();
}
class Derivedclass extends Baseclass
{
 void display()
 {
  System.out.println("Derivedclass");
 }
}
class Baseclass
{
 public static void main(String args[])
 {
  Derivedclass dc=new  Derivedclass();
  dc.display();
 }
}