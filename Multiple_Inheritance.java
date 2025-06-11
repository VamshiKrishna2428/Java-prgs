interface Calc_Area
{
 float area(float x,float y);
}
class Rectangle implements Calc_Area
{
 public float area(float l,float b)
 {
  return(l*b);
 }
}
class Triangle implements Calc_Area
{
 public float area(float b,float h)
 {
  return(b*h/2);
 }
}
class Multiple_Inheritance
{
 public static void main(String args[])
 {
  Rectangle r=new Rectangle();
  Triangle t=new Triangle();
  Calc_Area ar;
  ar=r;
  System.out.println("Area Of Rectangle is:"+ar.area(5,9));
  ar=t;
  System.out.println("Area Of Triangle is:"+ar.area(8,12));
 }
}