import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Chandrahas Reddy","Pola",30140068));
		employeeList.add(new Employee("Jane","Jones",30140069));
		employeeList.add(new Employee("Reddy","Pola",30140021));
		
		//System.out.println(employeeList);
		
//		for(int i=0;i<employeeList.size();i++) {
//			System.out.println(employeeList.get(i));
//		}
		
//		System.out.println(employeeList.get(0));
//		
//		System.out.println(employeeList.isEmpty());
//		System.out.println("-------------------------------------");
//		employeeList.set(1, new Employee("adam","eve",5462));
//		for(int i=0;i<employeeList.size();i++) {
//			System.out.println(employeeList.get(i));
//		
//		}
//		System.out.println(employeeList.size());
		
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(int i =0;i<employeeArray.length;i++) {
			System.out.println(employeeArray[i]);
		}
		System.out.println(employeeList.contains(new Employee("Chandrahas Reddy","Pola",30140068)));
		System.out.println(employeeList.indexOf(new Employee("Chandrahas Reddy","Pola",30140068)));
	}

}
