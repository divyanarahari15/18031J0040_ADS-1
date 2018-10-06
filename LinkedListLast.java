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
public class LinkedListLast {
	Node head;
	Node tail;
	void InsertAtLast(String data)
	{
		Node n=new Node(data);
		if(head==null&&tail==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			tail.next=n;
			tail=tail.next;
		}
	}
	void dispaly()
	{
		Node current = head;
	    while (current != null) {
	        current.displayNode();
	        current = current.next;
	    }
	}
	void deleteAtLast()
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.next.next==null)
			{
				temp.next=null;
			}
		}
		temp=temp.next;
	}
	public static void main(String args[])
	{
		LinkedListLast l=new LinkedListLast();
		l.InsertAtLast("hi");
		l.InsertAtLast("hello");
		l.dispaly();
		l.deleteAtLast();
		l.dispaly();
	}
}
