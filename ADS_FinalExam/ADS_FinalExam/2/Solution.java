import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	 {
		 pc42<String, Integer> st = new pc42<String, Integer>();
	     Scanner sc=new Scanner(System.in);
	     int n=Integer.parseInt(sc.nextLine());
	  
	     for(int i=0;i<n;i++) {
		 String s=sc.nextLine();
		 String temp[]=s.split(" ");
		 String key=temp[0];
		 int val=Integer.parseInt(temp[1]);
		 st.put(key, val);
		
	  }
	  for (String s : st.keys())
	  {
		  System.out.println("Key : "+s+" Value : "+st.get(s));
	  }
	  System.out.println("max"+st.max());
	  System.out.println(st.contains("A"));
	  System.out.println("Floor"+st.floor("C"));
	 }
}