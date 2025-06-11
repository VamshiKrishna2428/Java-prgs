import java.util.*;
public class Try_Catch{
	public static void main(String args[]){
		try{
			int d=10/0;
			System.out.println("1");
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("2");
		}
		finally{
			System.out.println("I'm executed");
		}
		System.out.println("3");
	}
}