import java.util.Arrays;

public class FixedEmployeeRun {
public static void main(String args[]){
		
	FixedEmployee[] empArr = new FixedEmployee[4];
		empArr[0] = new FixedEmployee(10, "Mikey", 25, 10000);
		empArr[1] = new FixedEmployee(20, "Arun", 29, 20000);
		empArr[2] = new FixedEmployee(5, "Lisa", 35, 5000);
		empArr[3] = new FixedEmployee(1, "Pankaj", 32, 50000);

		//sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
	}
	
	

}
