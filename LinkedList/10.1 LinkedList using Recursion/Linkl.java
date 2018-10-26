
public class Linkl {
Node head;

public void pushend(int a)
	{
		Node n=new Node(a);
	
		if(head==null)
		{
			head=n;
		}
		else
		{	Node temp =head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=n;
		}
		
	}
	public int  popend()
{
		Node temp1=null;
	
	if(head==null)
		
	{
		System.out.println("Stack is empty");
		return -1;
	}
	else if(head.next==null)
	{Node temp=head;
	head=null;
		return temp.data;
	}
	else
	{
		Node temp=head;
	
	while(temp.next.next!=null)
	{
		temp=temp.next;
	}
	temp1=temp.next;
	temp.next=null;
	return temp1.data;
	}
	

}

public void display()
{	
	Node temp=head;
	if(head==null)
	{
		System.out.print("No elements to reverse.");
	}
	else
	{
	while(temp!=null)
	{
		if(temp.next!=null)
		{
		System.out.print(temp.data+", ");
		}
		else
		{
			System.out.print(temp.data);
		}
		temp=temp.next;
	}
	System.out.println();
	}
}
public void pushfront(int a)
{

		Node n=new Node(a);
	
		if(head==null)
		{
			head=n;
		}
		else
		{	n.next=head;
		    head=n;
		}
		
}
public int popfront()
{
	
		if(head==null)
		{
			return -1;
		}
		else
		{	Node temp1=head;
		head=head.next;
		   return temp1.data;
		}
		
}
public void pushmiddle(int a)
{
	Node n=new Node(a);
	int count=1;
	
	if(head==null)
	{
		head=n;
	}
	else
	{	Node temp =head;
	while(count!=size()/2)
	{
		temp=temp.next;
		count++;
	}
	
	n.next=temp.next;
	temp.next=n;
	}
}
public void insertAt(int a,int b)
{
	Node n=new Node(b);
	int count=0;
	
	if(head==null)
	{
		head=n;
	}
	else if(a==0)
	{
		n.next=head;
		head=n;
	}
	else
	{
		
		Node temp =head;
	while(count+1!=a && temp.next!=null)
	{
		temp=temp.next;
		count++;
	}
	
	n.next=temp.next;
	temp.next=n;
	}
	
}
public void insertAta(int a,int b)
{
	Node n=new Node(b);
	int count=0;
	
	if(head==null)
	{
		head=n;
	}
	else if(a==0)
	{
		n.next=head;
		head=n;
	}
	else
	{
		
		Node temp =head;
		recurssion(a,b,temp,count);
	n.next=temp.next;
	temp.next=n;
	}
	
}
public void recurssion(int a1,int b1,Node n1,int c)
{
	if(c+1!=a1 && n1.next!=null)
	{
		n1=n1.next;
		c++;
		recurssion( a1, b1, n1, c);
	}
}
public int popmiddle()
{int count=1;
	if(head==null)
	{
		return -1;
	}
	else if(head.next==null)
	{Node temp =head;
	head=null;
	return temp.data;
		
	}
	else
	{
		Node temp =head;
		while(count!=(size()/2)-1)
	{
		temp=temp.next;
		count++;
	}
		Node temp1=temp.next;
		temp.next=temp.next.next;
		
	return temp1.data;
	}
	
}
public void reverse(int c1)
{
	int c=c1;
	int n=size();
	Node temp = head; 
int t;
	if(n<c)
	{
		System.out.println("No elements to reverse.");
	}
	if(c!=n && temp!=null)
	{
		//System.out.println("c"+c+" "+n);
		t=popend();
		insertAt(c,t);
		temp=temp.next;
		c++;
		reverse(c);
	}
	
	
}

public int size()
{Node temp1=head;
int count=0;
while(temp1!=null)
{
	temp1=temp1.next;
	count++;
	
}
return count;
	
}
public String toString() {
	if(head.next==null)
	{
		return head.data+"";
	}
	else
	{
	return head.toString();
	}
}

}


