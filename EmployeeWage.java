public class EmployeeWage 
{  

//CONSTANTS
public static final int IS_Employee_Present=1;
public static final int Full_Time=1;
public static final int Part_Time=0;
public static final int EMP_RATE_PER_HOUR=20;
public static final int NUM_OF_WORKING_DAYS=20;
public static final int MAX_HRS_IN_MONTH=100;

public static void main(String[] args)
{
//variables
int totalEmpHours=0;
int empHrs=0;
int totalWorkingDays=0;

//Display the Welcome Message
System.out.println("Welcome to the EmployeeWage Program");

while(totalEmpHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
	{
		totalWorkingDays++;

		//generate 0-2
		int employeeCheck = (int) Math.floor(Math.random() * 10 ) % 3;

/*
* Switch Case
*/
switch(employeeCheck)
{
case Full_Time :
	System.out.println("Employee is full time");
	totalEmpHours=8;
	break;
case Part_Time:
	System.out.println("Employee is part time");
	totalEmpHours=4;
	break;
default :
	System.out.println("employee absent");
	break;

}
totalEmpHours+=empHrs;
System.out.println("Day:" +NUM_OF_WORKING_DAYS+"Emp Hour:"+empHrs);
}
int totalEmpWage= totalEmpHours * EMP_RATE_PER_HOUR;
System.out.println("Total Employee Wage:"+totalEmpWage);


}
}

