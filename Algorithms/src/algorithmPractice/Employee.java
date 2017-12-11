package algorithmPractice;
import java.util.Random;


 class Employee {
	public int employeeNumber = 0;
	public String employeeName = null;
	public String employeeLastName = null;
	public String emailId = null;
	
	//constructor
	public Employee(int employeeNumber, String employeeName,String employeeLastName, String emailId) {
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeLastName = employeeLastName;
		this.emailId = emailId;
		
	}
	
	public String toString() {
		return  this.employeeNumber + "\n" + this.employeeName + "\n" + this.employeeLastName + "\n" + this.emailId + "\n";
	}
	
	

	
	public static void main(String [] args) {
		
		Random r = new Random();
		Employee[] employees = new Employee[4];
		String rand = "";
		for(int i = 0; i< 4;i++) {
			for(int j = 0; j<6; j++ ) {
				rand += r.nextInt(10);
				
				
			}
			//System.out.println(rand);
			Integer empNumber = Integer.parseInt(rand);
			Employee e1 = new Employee(empNumber,"person" + i, "surname" + i, "personemail" + i + "@google.com");
			rand = "";
			employees[i] = e1;
			
		}
		
		System.out.println("before sort....");
		for(Employee e: employees) {
			System.out.println(e.employeeNumber);
		}
		
		employees = sort(employees);
		
		System.out.println("after sort....");
		for(Employee e: employees) {
			System.out.println(e.employeeNumber);
		}
		
		
	

	}
	
	public static Employee[] sort(Employee[] array) {
		//insertion sort
		for(int j =1; j < array.length; j++) {
			int key = array[j].employeeNumber;
			int i = j-1;
			
			while((i> -1) && (array[i].employeeNumber > key)) {
				array[i+1] = array[i];
				i--;
			}
			array[i+1].employeeNumber = key;
		}
		return array;
		
	}
	
	

}
