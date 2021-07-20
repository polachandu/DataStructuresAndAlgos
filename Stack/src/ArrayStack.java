
public class ArrayStack {
	
	public Node head;
	public int length;
	
	public class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
			this.next = next;
		}
		
	}
	
	public void push(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
		}else {
			Node currentNode = this.head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
			
		
	}
	
	public void pop() {
		if(this.head == null) {
			System.out.println("Stack is empty");
		}else {
		Node currentNode = this.head;
		Node previousNode = this.head;
		while(currentNode.next != null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		previousNode.next = null;
		}
	}
	
	public void insert(int position , int value) {
		Node newNode = new Node(value);
		
		Node currentNode = this.head;
		Node previousNode = this.head;
		
		if(position == 1) {
			newNode.next = head;
			this.head = newNode;
			return;
		}else {
			while(currentNode.next != null && --position>0) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = newNode;
			newNode.next = currentNode;
		}
	}
	
	public void print() {
		if(this.head == null) {
			System.out.println("stack is empty");
		}else {
			Node currentNode = this.head;
			while(currentNode != null) {
				System.out.print(currentNode.value+" -> ");
				currentNode = currentNode.next;
			}
			System.out.println("null");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack as = new ArrayStack();
		as.push(0);
		as.push(1);
		as.push(2);
		as.push(3);
		as.print();
		as.pop();
		as.print();

	}

}
