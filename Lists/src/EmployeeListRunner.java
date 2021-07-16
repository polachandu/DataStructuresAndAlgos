
public class EmployeeListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee janesJohn = new Employee("Janes","John", 123);
		Employee johnDoe = new Employee("John","Doe", 4567);
		Employee marrySmith = new Employee("Marry","Smith", 22);
		Employee mikeWilson = new Employee("Mike","Wilson", 789);
		
		
		
		EmployeeLinkedLists list = new EmployeeLinkedLists();
		
		System.out.println(list.isEmpty());
		
		list.addToFront(janesJohn);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		System.out.println(list.getSize());
		
		
		list.printList();
		
		list.removeFromFront();
		System.out.println("\n");
		System.out.println(list.getSize());
		list.printList();
		
		
		
		
		
	}

}
