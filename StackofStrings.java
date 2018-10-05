package m4;

import java.util.Scanner;

public class StackofStrings {
	int[] in;
	int len;
	int top=-1;
	StackofStrings(int n)
	{
		in=new int[n];
		this.len=n;
	}
	boolean isEmpty(int t)
	{
		return t==-1;
	}
	boolean isfull(int t)
	{
		return t==this.len;
	}
	
	public void push(int n)
	{
		if(!isfull(this.top))
		{
		in[++this.top]=n;
		}
		else
		{
			System.out.println("Stack is full!");
		}
	}
	public int pop()
	{
		if(!isEmpty(this.top))
		{
			return in[this.top--];
		}
		else
		{
			System.out.println("Stack is empty !");
			return 0;
		}
	}
public static void main(String args[])
{Scanner s=new Scanner(System.in);
String a =s.nextLine() ;

int num=a.length();
String b[] = a.split(" ");
int n3=0;
	StackofStrings stack=new StackofStrings(num);
	for(int i = 0;i<b.length;i++)
	{
	if(b[i].equals("*"))
	{
		int n1=stack.pop();
		int n2=stack.pop();
		n3=n1*n2;
		stack.push(n3);
		
	}
	else if(b[i].equals("+"))
	{
		int n1=stack.pop();
		int n2=stack.pop();
		n3=n1+n2;
		stack.push(n3);
		
	}
	else
	{
		int m=Integer.parseInt(b[i]);
		
		stack.push(m);
	}
	}

	System.out.println(stack.pop());
}
}

