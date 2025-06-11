import java.io.*;
class Shape
{
 public int side=10;
}
class Square extends Shape
{ 
 void area()
 {
  int area=side*side;
  System.out.println("Area of Square:"+area);
  }
}
class InheritanceDemo
{
 public static void main(String[] args)
 {
  Square s=new Square();
  s.area();
 }
}
 