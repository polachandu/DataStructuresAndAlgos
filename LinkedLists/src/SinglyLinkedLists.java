public class SinglyLinkedLists {

	// reference to head / first node of the Singly Linked List
	public Node head ;
	public int length=0;
	// class Node that hold data and a reference/link
	// to the next Node in the list
	class Node {
		private int data;
		private Node next;
		private int length;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
  
    /*
	 * Method to add a node at the beginning of the list
	 */
	public void addNodeAtTheBeginning(int data) {
        System.out.println("Add a node with data " + data + " in the beginning.");
		// Create a new node
		Node newNode = new Node(data);

		// Check if the list is empty
		if (this.head == null) {
			// Make the new node as head
			this.head = newNode;
		} else {
			// Point the new node's next to head
			newNode.next = this.head;

			// Make the new node as head
			this.head = newNode;
			this.length++;
		}
	}
	 /*
	  * Method to delete a node at the end of the list
	  */
	public void deleteAtTheBegining() {
		System.out.println("Node delete at begining");
		
		// Check if the list is empty
		if(this.head == null) {
			System.out.println("Nothing to delete because list is empty");
		}else {
			Node currentNode = this.head;
			this.head = currentNode.next;
			this.length--;
			
		}
	}
	
  
    /*
	 * Method to add a node at the end of the list
	 */
	public void addNodeAtTheEnd(int data) {
        System.out.println("Add a node with data " + data + " at the end.");
		// Create a new node
		Node newNode = new Node(data);

		// Check if the list is empty
		if (this.head == null) {
			// Make the new node as head
			this.head = newNode;
		} else {
			Node currentNode = this.head;
			// traverse to the end of the list
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			this.length++;
		}
	}
	
	/*
	 * Method to add a node at the specified position in the list
	 */
	public void deleteNodeAtTheEnd() {
		System.out.println("Node deleted at end");
		if(this.head==null) {
			System.out.println("No nodes to deleted");
		}else {
			Node currentNode = this.head;
			Node previousNode = this.head;
			while(currentNode.next != null) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = null;
			this.length--;
		}
	}
	
  
  
	/*
	 * Method to add a node at the specified position in the list
	 */
	public void add(int position, int data) {
        System.out.println("Add a node with data " + data + " at the position " + position);
		// Create a new node
		Node newNode = new Node(data);

		// Init the cur and prev nodes to the head
		Node currentNode = this.head;
		Node previousNode = this.head;

		if (position == 1) {
			// Point the new node's next to head
			newNode.next = head;
			// Make the new node as head
			this.head = newNode;
			this.length++;
			return;
		}

		// traverse to the end of the list and check positions moved
		while (currentNode.next != null && --position > 0) {
			// update the prev and cur references
			previousNode  = currentNode;
			currentNode = currentNode.next;
		}

		// update prev to point to new node
		previousNode.next = newNode;

		// & new node to point to current node
		newNode.next = currentNode;
		this.length++;
	}
	/*
	 * Method to get the value of Node at the specified position in the list
	 */
	public void get(int index) {
		if(index<0 || index>this.length) {
			System.out.println("These Nodes are unavailable");
		}else {
		int counter =0;
		Node currentNode = this.head;
		while(counter!=index) {
			currentNode = currentNode.next;
			counter++;
			}
		System.out.println(currentNode.data);
		}
	}
	

  	public void print() {
		if (this.head == null) {
			System.out.println("The List is empty.");
		} else {
			System.out.println("The contents of the Singly Linked List are : ");
			Node currentNode = this.head;
			while (currentNode != null) {
				System.out.print(currentNode.data + " -> ");
				currentNode = currentNode.next;
			}
			System.out.println("NULL\n");
			System.out.println("Length of the list is: "+(length+1));
		}
	}
  
  	public static void main(String[] args) {
  		SinglyLinkedLists list = new SinglyLinkedLists();
        System.out.println("Created a singly linked list .....");
	    list.print();
	    list.deleteAtTheBegining();
		list.addNodeAtTheBeginning(100);
	    list.print();
		list.addNodeAtTheBeginning(200);
		list.print();
      	list.addNodeAtTheEnd(900);
	    list.print();
		list.addNodeAtTheEnd(800);
		list.print();
        list.add(1,150);
        list.print();
        list.add(4,250);
        list.print();
        list.add(6,250);
        list.print();
        list.deleteNodeAtTheEnd();
        list.print();
        list.get(5);
    }
}