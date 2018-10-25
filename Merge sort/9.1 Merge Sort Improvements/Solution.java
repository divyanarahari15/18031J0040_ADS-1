import java.lang.*;
import java.util.Scanner;
public class MergeSortSolution{
	void merge(int []arr,int left,int right,int mid)
	{ 
		//int mid=arr.length/2; 
		int n=mid-left+1;
	    int n1=right-mid;
		int L[]=new int[n];
		int R[]=new int[n1];

		for(int i=0;i<mid-left;i++)
		{
		L[i]=arr[left+i];
	    }
		for(int j=0;j<n-mid;j++)
		{
		R[j]=arr[mid+1+j];	
		}
		for(int i=0;i<L.length;i++)
			System.out.println(L[i]);
		int i=0,j=0;
		//j=left;
		int k=left;
		while(i<n && j<n1)
		{			
			if(L[i]<=R[j])

			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
				
		}
	}
void sort(int arr[],int left,int right){			
	if(left>right)	
	{
	int mid=(left+right)/2;
	sort(arr,left,mid);
	sort(arr,mid+1,right);
	merge(arr,left,right,mid);
	}
}
void printArray(int arr[])
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
} 
public static void main(String args[])
{
Scanner s=new Scanner(System.in);	
int n;
System.out.println("enter the value of n:");
n=s.nextInt();
System.out.println("enter array value:");
int arr[] = new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
MergeSortSolution m=new MergeSortSolution();

m.sort(arr, 0, arr.length-1);
System.out.println("f");
System.out.println("sorted array:");
int i=0;
for(i = 0 ; i< arr.length;i++)
	System.out.println(arr[i]+"  ");
}
}
