import java.io.*;
import java.util.*;
class Student
{
 String sname= "Vamshi";
 int sid=28;
}
class Department extends Student
{
 String dept="BSc";
}
class Marks extends Department
{
 int sub1=90,sub2=90;
 void total()
 {
  int total=sub1+sub2;
 }
 void display()
 {
  System.out.println("student name:"+sname+"\nstudent id:"+sid+"\nDepartment:"+dept+"\nMarks of subject1:"+sub1+"\nMarks of subject2:"+sub2);
 }
}
class Krishna
{
 public static void main(String args[])
 {
  Marks m=new Marks();
  m.total();
  m.display();
 }
}