class Node {

	public String item;
	public Node next;

	public Node(String item) {
	    this.item = item;
	}

	public void displayNode() {
	    System.out.print(item);
	    System.out.print("  ");

	 }
	}
public class Solution{
private Node first;
private Node last;
public boolean isEmpty()
{
	return first==null;
}
public void EnqueueAtLast(String item)
{
	
	Node oldlast=last;
	last=new Node(item);
	last.item=item;
	last.next=null;
	
	if(isEmpty())
	{
		first=last;
	}
	else
	{
		oldlast.next=last;
	}
}
public void EnqueueAtFirst(String item)
{
	 Node n = new Node(item);
	    n.next = first;
	   
	    if(isEmpty())
		{
	    	last=n;
	    	 first = n;
		}
	    /*if(isEmpty())
		{
			first=last;
		}*/
		else
		{
			Node temp=first;
			first=n;
			first.next=temp;
		}
}
public String DequeueAtFirst()
{
	String item=first.item;
	first=first.next;
	if(isEmpty())
	{
		last=null;
	}
	return item;
}
public void DequeueAtLast()
{
	Node temp=first;
	
		while(temp!=null)
		{
			
			if(temp.next.next==null)
			{
				
				temp.next=null;
			}
			temp=temp.next;
		}
		
}

void dispaly1()
{
	Node temp = first;
    while (temp!= null) {
    	temp.displayNode();
    	temp = temp.next;
    }
}
public static void main(String args[])
{
	Solution q=new Solution();
	q.EnqueueAtFirst("hi");
	q.EnqueueAtLast("hello");
	q.EnqueueAtLast("dolly");
	q.EnqueueAtFirst("hi");
	System.out.println("before dequeue");
	q.dispaly1();
	q.DequeueAtLast();
	System.out.println("after dequeue");
	q.dispaly1();
	q.DequeueAtFirst();
	System.out.println("after dequeue");
	q.dispaly1();
}
}