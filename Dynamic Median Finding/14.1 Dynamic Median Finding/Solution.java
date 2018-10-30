import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Dynamicmedian dm=new Dynamicmedian();
		int n=s.nextInt();
		int a[] = new int[n];
		int l=0;
		
		int b[] = null;
		int c=0;
		int i=0;
		while(n>0)
		{
			a[i]=s.nextInt();
			l=i+1;
			dm.median(a,l);
			i++;
			//dm.printArray(a);
			n--;
		}

	}

}
 class Dynamicmedian 
{
	int t[]=null;
	static int j=0;


	 public void sort(int arr[],int l) 
	 { 
	     int n = l; 

	     // Build heap (rearrange array) 
	     for (int i = n / 2 - 1; i >= 0; i--) 
	         heapify(arr, n, i); 

	     // One by one extract an element from heap 
	     for (int i=n-1; i>=0; i--) 
	     { 
	         // Move current root to end 
	         int temp = arr[0]; 
	         arr[0] = arr[i]; 
	         arr[i] = temp; 

	         // call max heapify on the reduced heap 
	         heapify(arr, i, 0); 
	     } 
	 }
	 
	 void heapify(int arr[], int n, int i) 
	 { 
	     int largest = i; // Initialize largest as root 
	     int l = 2*i + 1; // left = 2*i + 1 
	     int r = 2*i + 2; // right = 2*i + 2 

	     // If left child is larger than root 
	     if (l < n && arr[l] > arr[largest]) 
	         largest = l; 

	     // If right child is larger than largest so far 
	     if (r < n && arr[r] > arr[largest]) 
	         largest = r; 

	     // If largest is not root 
	     if (largest != i) 
	     { 
	         int swap = arr[i]; 
	         arr[i] = arr[largest]; 
	         arr[largest] = swap; 

	         // Recursively heapify the affected sub-tree 
	         heapify(arr, n, largest); 
	     } 
	 } 
	 
	 static void printArray(int arr[],int l) 
	 { double a[]=new double[arr.length];
	     int n = arr.length; 
	    
	    
	     //System.out.println(); 
	   //  System.out.println(l+"jk");
		 if(l==1)
		 {double no=arr[l-1];
		 a[j]=no;
		 j++;
			System.out.println(no);
		 }
		 else  if(l%2==0)
		 {
			double k= (double)(arr[(l/2)-1]+arr[(l/2)])/2.0;
			a[j]=k;
			j++;
			System.out.println(k);
		 }
		 else
		 {
			 double p=arr[((l)/2)];
			 a[j]=p;
			 j++;
			 System.out.println(p);
		 }
	 }
	 
	 
	 void  median( int arr[],int l)
	 {
		
		 sort(arr,l);
		 printArray(arr,l);
		
		
		 
	 }
	 
}
