import java.util.Arrays;
import java.util.Scanner;
public class Pairs {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner s= new Scanner(System.in);
			System.out.println("enter no of elements:");
			int n=s.nextInt();
			int[] a = new int[n] ;
			for(int i = 0;i<n;i++)
			{
				System.out.println("enter element");
				a[i]=s.nextInt();
			}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int count=0;
		for(int i = 0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
		}
		System.out.println("no of pairs of numbers is "+count);
		}
	}


