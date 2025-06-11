import java.util.Scanner;
class EvenOrOdd
{
 public static void main(String args[])
 {
  int x=10;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the values of x:");
  x=sc.nextInt();
  if(x%2==0)
  {
   System.out.println(x+"is an even number");
  }
  else
  {
   System.out.println(x+"is an odd number");
  }
 }
}