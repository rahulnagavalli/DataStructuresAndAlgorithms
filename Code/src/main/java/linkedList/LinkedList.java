package linkedList;
public class LinkedList {
	
	// This variable is mandatory, because a LinkedList will be having a head even if it is empty or not.
	// If empty, then head will point to null.
	// If not empty, then head will point to a Node.
	Node head;
	
	public void insert(int data) {
		// If you want to insert data into a LinkedList, then we have to first create a Node (As a LinkedList is 
		// made up of nodes). That node must have data and pointer to next node.
		Node newNode = new Node();
		newNode.data = data;
		// As we don't know if the data should be inserted at the beginning or at the end, so just keep the pointer as null.
		newNode.next = null;
		if (head == null)
			head = newNode;
		else {
			// As there is no index system in linkedList, you have to traverse from beginning of the LinkedList (starting from head).
			// So, create a new variable and refer it to head (Because, you can go to next node only using a temporary node).
			Node n = head;
			while (n.next!= null)
				n = n.next;
			n.next = newNode;
		}
	}
	
	public void insertAtHead(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		while(head.next != null) {
			System.out.println(head.data);
			head = head.next;
		}
		System.out.println(head.data);
	}
	
	public void printPattern() {
		if(head == null)
			System.out.println("LinkedList is empty!");
		while (head.next!= null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head.data);
	}
	
	public boolean search(int data) {
		if(head.next == null) {
			System.out.println("Head is pointing to null");
			return false;
		}
		Node n = head;
		while (n.next != null) {
			if(n.data == data) {
				return true;
			}
			n = n.next;
		}
		if (n.data == data)
			return true;
		return false;
	}
}
