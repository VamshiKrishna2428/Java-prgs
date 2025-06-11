import java.util.Scanner;
class Employee{
    private String name ;
    private double hourlyrate ;
    private double hoursworked ;

    public Employee(String name,double hourlyrate,double hoursworked){
        this.name = name;
        this.hourlyrate = hourlyrate;
        this.hoursworked = hoursworked;        
    }
    public double getsalary() {
        double salary = hourlyrate*hoursworked;
        if(hoursworked>40){
            salary + = (hoursworked-40)*hourlyrate*0.5;
        }
        return salary;
    }
    public String getName(){
        return name;
    }
}
public class StringCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees!");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the name of employee #"+(i+1)+"!");
            String name = sc.next();
            System.out.print("Enter the hourly rate of employee #"+(i+1)+":");
            double hourlyrate = sc.nextDouble();
            System.out.println("Enter the hours worked by employee #"+(i+1)+":");
            double hoursworked = sc.next Double();
            employee [i] = new Employee (name, hourlyrate, hoursworked);
        }
        System.out.println("Employee salaries");
        for(Employee e: employees){
            System.out.println(e.getName()+":$"+e.getsalary());
        }
    }
}
