

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	switch(s1)
	{
	case "String":int n=s.nextInt();
	              String s2[]=new String[n];
	              String s01=s.nextLine();
	              for(int i = 0;s.hasNext();i++)
	              {
	            	 String s3=s.next();
	            
	            	 String s4[]=null;
	            	 s4=s3.split(",");
	            	
	            	 Minheap m=new Minheap();
	            	System.out.println(m.comparestring(s4));
	              }
	              break;
	case "Integer":
		int n1=s.nextInt();
        String s21[]=new String[n1];
        String s011=s.nextLine();
        
        for(int i = 0;s.hasNext();i++)
        {
      	 String s3=s.next();
      
      	 String s4[]=null;
      	 s4=s3.split(",");
      	
      	 Minheap m=new Minheap();
      	System.out.println(m.compare(s4));
        }
        break;
	case "Double":
		int n11=s.nextInt();
        String s211[]=new String[n11];
        String s0111=s.nextLine();
        
        for(int i = 0;s.hasNext();i++)
        {
      	 String s3=s.next();
      
      	 String s4[]=null;
      	 s4=s3.split(",");
      	
      	 Minheap m=new Minheap();
      	System.out.println(m.compare(s4));
        }
        break;
        
	case "Float":
		int n111=s.nextInt();
        String s2111[]=new String[n111];
        String s01111=s.nextLine();
        
        for(int i = 0;s.hasNext();i++)
        {
      	 String s3=s.next();
      
      	 String s4[]=null;
      	 s4=s3.split(",");
      	
      	 Minheap m=new Minheap();
      	System.out.println(m.compare(s4));
        }
        break;
	}

	}

}
class Minheap
{
	public boolean comparestring(String arr[])
	{int c=0;
		for(int i = 0;i<arr.length-1;)
		{
			int c1=arr[i].charAt(0);
			int c2=arr[i+1].charAt(0);
			
			if(c1<=c2)
			{
				i++;
				c++;
				
			}
			else
			{
				
				c=0;
				break;
			}
		
		
		
		}
		if(c==arr.length-1)
		{
			return true;
		}
		else
		{
		return false;
		}
		
}
	public boolean compare(String arr[])
	{
		int c=0;
		for(int i = 0;i<arr.length-1;)
		{
			double d1=(double)Integer.parseInt(arr[i]);
			double d2=(double)Integer.parseInt(arr[i+1]);
			if(d1<=d2)
			{
				i++;
				c++;
				
			}
			else
			{
				
				c=0;
				break;
			}
		
		
		
		}
		if(c==arr.length-1)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
		
		
	
}
