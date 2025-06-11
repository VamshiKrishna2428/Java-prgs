import java.io.*;
import java.util.*;
class WrapperExample
{
 public static void main(String args[]) throws IOException
 {
  byte x = 10;
  float y = 25.07f;
  double z = 4654321.68;
  Byte r = new Byte(x);
  Float f = new Float(y);
  Double d = new Double(z);
  System.out.println("Byte to Int value;"+r.intValue());
  System.out.println("Float to Int value;"+f.intValue());
  System.out.println(" Double to Long value:"+d.longValue());
 }
}