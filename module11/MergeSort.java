package pc3;

import java.util.Scanner;

class Student{
 String name;
 String dob;
 int sub1,sub2,sub3,totalmarks;
void add(String name,String dob,int sub1,int sub2,int sub3,int totalmarks)
{
this.name=name;
this.dob=dob;
this.sub1=sub1;
this.sub2=sub2;
this.sub3=sub3;
this.totalmarks=totalmarks;
}
}
public class MergeSortPc
{
	void merge(int[] arr,int left,int right,int mid)
	{
		int n=mid-left+1;
		int n1=right-mid;
		int L[]=new int[n];
		int R[]=new int[n1];
		for(int i=0;i<n;i++)
		{
			L[i]=arr[left+i];
		}
		for(int j=0;j<n1;j++)
		{
			R[j]=arr[mid+1+j];
		}
		int i=0, j = 0;
		int k=left;
		while(i<n && j<n1)
		{
			if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        }
		while(i<n)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n1)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
		}
	void sort(int arr[],int left,int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,right,mid);
			
		}
	}
	void PrintArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr+",");
		}
		//System.out.println("f");
	}
	/*public int add(int arr[])
	{
	int sum=(a+b+c);
	return sum;
	}*/
	void display() {
	}
	public static void main(String args[])
	{
	    Scanner s=new Scanner(System.in);	
		int n;
		System.out.println("enter the value of n:");
		n=s.nextInt();
		System.out.println("enter marks:");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			//System.out.println("f");
			arr[i]=s.nextInt();
		}
		MergeSortPc m=new MergeSortPc();
	    //int arr[]={12, 11, 13, 5, 6, 7};
		 System.out.println("Given Array");
		 for(int i = 0 ; i< arr.length;i++)
		 {
				System.out.println(arr[i]);
		 }
		 
		 m.sort(arr, 0, arr.length-1);
	          
        System.out.println("sorted array:");
		for(int i = 0 ; i< arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}