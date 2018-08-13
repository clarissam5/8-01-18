
public class Payroll {



	public static double calculatePay(Employee employee) {
			//Employee is class type and employee is the object 
			//switched void to double because we added a return value 
			//void return type when you don't want to return anything 
		/*Pay cycle is bi-weekly. This function will be calculating an employee's paycheck for the cycle 
		 * based on salary and payrate 
		 */
		double salary;
			//if the employee has a yearly salary
		if(employee.payRate == "YEARLY") {
			salary = (employee.salary/52)*2;
		}
		else if(employee.payRate == "Hourly") {
			salary = (employee.salary * employee.hours * 2);
		}
		else {
			salary = 0.0;
		}
		return salary;
	}
	
	
	
	public static void main(String args[]) {
	    
		Employee Tom = new Employee("Tom Haveford", 1234 , 44.90, "Hourly", "09-01-2016", "PART-TIME", 25);
		Employee John = new Employee("John Smith", 50000, "YEARLY", "09-01-2016", "PART-TIME");	
		Employee Sam = new Employee("Sam Barrett", 2345, 50.25, "HOURLY", "10-04-2017", "FULL-TIME", 90);
		Employee Joy =  new Employee(" Joy Brown", 75000, "YEARLY", "10-04-2017", "FULL TIME");
		Employee Ron = new Employee("Ron Weasely", 65000, "YEARLY", "10-04-2017", "FULL TIME");
		
		//System.out.println(calculatePay(Tom));
		//System.out.println(calculatePay(John));
		//below is the statement invoking the method created in the Employee class
				//John.compare(Tom);
		
		Employee[] arrE = new Employee [5];
			arrE[0] = Tom;
			arrE[1] = John;
			arrE[2] = Sam;
			arrE[3] = Joy;
			arrE[4] = Ron;
 			
		for(Employee employee: arrE) {
			System.out.println(employee + "\n");
		}
			
		
		/*FileNotFoundException
		IOException
		SocketTimeoutException

		Programming errors:
		NullPointerException
		ArrayIndexOutOfBoundsException
		ArithmeticException*/
	}
	
}
