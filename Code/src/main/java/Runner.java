public class Runner {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(5);
		linkedList.insert(2);
		linkedList.insert(9);
		linkedList.insertAtHead(22);
		linkedList.insertAtHead(45);
//		linkedList.print();
//		linkedList.printPattern();
//		System.out.println();
		System.out.println("Is the element found ? : " + linkedList.search(4));
		linkedList.hashCode();
	}

}
