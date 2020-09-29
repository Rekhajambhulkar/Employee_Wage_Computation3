public class EmployeeWage 
{  

//CONSTANTS
public static final int IS_Employee_Present=1;

public static void main(String[] args)
{
//Display the Welcome Message
System.out.println("Welcome to the EmployeeWage Program");

//generate 0-2
double employeeCheck=Math.floor(Math.random()*10)%3;

if(IS_Employee_Present == employeeCheck)
{ 
	System.out.println("Employee is present");
}
else
{ 
	System.out.println("Employee is Absent");

}
}
}

