package module4;

class Node {

		public String data;
		public Node next;

		public Node(String data) {
		    this.data = data;
		}

		public void displayNode() {
		    System.out.print(data);
		    System.out.print("  ");

		 }
		}
public class LinkedList {
	private Node first = null;

		public void insertFirst(String data) {
		    Node n = new Node(data);
		    n.next = first;
		    first = n;
		}

		public Node deleteFirst() {
		    Node temp = first;
		    first = first.next;
		    return temp;
		}
	/*	public Node insertAfter(String data)
		{
			if(first==null)
			{
				System.out.println("cannot be added");
			}
			else
			{
			Node n=new Node(data);
			
			}
			return first;
		}*/

		public void displayList() {
		    Node current = first;
		    while (current != null) {
		        current.displayNode();
		        current = current.next;
		    }
		}
		public static void main(String args[])
		{
			LinkedList l=new LinkedList();
			l.insertFirst("it");
			l.insertFirst("from");
			l.deleteFirst();
			l.displayList();
		}
}
