import java.util.*;
abstract class parts{
	String n;
	parts(String n){
		this.n=n;
	}
	abstract void function();
	void f(){
		System.out.println(n);
	}
}
class brakes extends parts{
	brakes(String n){
		super(n);
		}
		void function(){
			System.out.println("Car should be halted");
		}
}
class accelerator extends parts{
	accelerator(String n){
		super(n);
		}
		void function(){
			System.out.println("Car should be accelerated");
		}
}
class gears extends parts{
	int ge;
 	gears(String n){
		super(n);
		//this.ge=ge;
		}
		void function(){
			System.out.println("Car gear should be changed"+" "+"5");
		}
}
public class car{
	public static void main(String args[]){
		brakes b = new brakes("brakes");
		b.function();
		b.f();
		accelerator a = new accelerator("accelerator");
		a.function();
		a.f();
		gears g = new gears("gear");
		g.function();
		g.f();
	}
}
		