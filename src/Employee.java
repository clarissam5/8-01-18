/*
 * Create a class employee and follow guidelines give
 * Author:Clarissa Mercado
 * Date: 8/1/18
 * 
 * 1. create class function
 * 2.Employees are going to have a string name, int employeeID, double salary, String payRate, String joinDate,
 * 	String type[]Employee and int hours
 *3.All the attributes are private 
 * 4. When initially hired, some employees may not have an employee ID for hours. Some employees may have values for all
 * 	Create constructors accordingly. 
 *  5.The above mentioend constructors are the only 2 that are allowed. So, while creating an object of 
 *  	class Employee, you will be using one of the 2 constructors that you created. (Hint: Do not write the 
 *  	defult constructor 
 *  6.Write hte toString method 
 *  7.Create another class called Payroll in the same project and leave it blank  
 *
 */
public class Employee {
	
	//declaring attributes
	private String name;
	private int employeeID;
	double salary;
	String payRate;
	private String joiningDate;
	private String typeOfEmployee;
	int hours;
	
	//creating constructors 
	Employee (String name, double salary, String payRate, String joiningDate, String typeOfEmployee){
		this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joiningDate = joiningDate;
		this.typeOfEmployee = typeOfEmployee;
	}
	Employee (String name, int employeeID, double salary, String payRate, String joiningDate, String typeOfEmployee, int hours){
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
		this.payRate = payRate;
		this.joiningDate = joiningDate;
		this.typeOfEmployee = typeOfEmployee;
		this.hours = hours;
	}
	
	public String toString() {
		return ("Name:" + this.name + "\n" + "Employee ID: " + this.employeeID + "\n" + "Salary:" + this.salary + "\n" + "Pay Rate:" + this.payRate + "\n" + "Join Date:" + this.joiningDate + "\n" + "Type of Employee: " + this.typeOfEmployee + "\n" + "Hours: " + this.hours);
	}
	
	void compare(Employee another){
		if(this.salary > another.salary)
			System.out.print("Salary greater");
	}
	

}
