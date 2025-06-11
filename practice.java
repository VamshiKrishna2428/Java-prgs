import java.io;
import java.util.*;
// interface
// interface printable{
//     void print();
// }
// interface showable{
//     void show();
// }
public class practice implements printable,showable{
    public void print(){
        System.out.println("print");
    }
    public void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {
        practice  p = new practice();
        p.print();
        p.show();
    }
}
