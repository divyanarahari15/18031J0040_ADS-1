package module3;
import java.util.Arrays;
import java.util.Scanner;
public class PairSorting {
		public static void main(String[] args) {
			int temp;
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
		//Arrays.sort(a);
			for(int i1=0;i1<a.length;i1++)
			{
				for(int j=i1;j>0;j--)
				{
					if (a[j] < a [j - 1]) {
					      temp = a[j];
					      a[j] = a[j - 1];
					      a[j - 1] = temp;
					}
				}
			}
			for(int i1=0;i1<a.length;i1++)
			{
				System.out.println(a[i1]);
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

