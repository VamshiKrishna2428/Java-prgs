import java.io.*;
class one{
    fun O(){
        System.out.println("this is one");
    }
}
class two extends one{
    fun T(){
        System.out.println("this is two");
    }
}
public class practice1{
    public static void main(String [] args){
        two t = new two();
        t.fun T;
        t.fun O;
    }
}