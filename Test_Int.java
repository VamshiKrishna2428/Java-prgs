import java.util.*;
interface printable {
	int a=10;
	void print();
}
interface showable{
	void show();
}
public class Test_Int implements printable,showable{
	public void print(){
		System.out.println("print");
	}
	public void show(){
		System.out.println("show");
	}
	public static void main(String[] args){
		Test_Int t = new Test_Int();
		t.print();
		t.show();
		System.out.println(t.a);
	}
}
	 