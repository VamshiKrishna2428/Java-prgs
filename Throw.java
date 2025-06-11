import java.util.*;
import java.io.*;
public class Throw{
    static void check (int a){
        if(a<18){
            throw ( new Arthemetic Exception) ("not eligible");
        }
        else{
             System.out.println("eligible");
        }
    }
    public static void main(String args[]){
        check(21);
        System.out.println("Hello");
    }
}