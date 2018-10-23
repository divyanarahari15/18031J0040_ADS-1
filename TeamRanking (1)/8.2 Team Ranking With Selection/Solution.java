import java.util.Scanner;

class Team
{
	String name;
	int wins,loses,draws;
	public Team(String name,int wins,int loses,int draws)
	{
		this.name=name;
		this.wins=wins;
		this.loses=loses;
		this.draws=draws;
	}
	
}
class InsertionSort 
{ 
	int count = 0;
    void sort(Team arr[]) 
    { 
    	int i=0;
        while(arr[i]!=null)
        {
        	if(arr[i]!=null)
        		count++;
        	i++;
        }
        
        int n = arr.length;
        for (i = 0; i <count; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i+1; j < count; j++) {
                if (arr[j].wins > arr[min].wins) 
                    min = j; 
                if(arr[j].wins == arr[min].wins) {
                	if (arr[j].loses < arr[min].loses) 
                        min = j; 
                }
                if((arr[j].wins == arr[min].wins)&&(arr[j].loses == arr[min].loses)) {
                	if (arr[j].draws > arr[min].draws) 
                        min = j; 
                }
            }
            Team temp = arr[min]; 
            arr[min] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
   
    void printArray(Team arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<count; i++) 
        	if(count==1)
            {
            	System.out.println(arr[0].name);
            }
        	else if((i+1)!=count)
	{
            	System.out.print(arr[i].name+","); 
	}
	else
	{
	System.out.print(arr[i].name);
	}
        System.out.println(); 
       
    } 
} 
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		Team[] t= new Team[10];
		while(sc.hasNext())
		{
		String team = sc.nextLine();
		if(team!=null)
		{
		String [] t2= team.split(",");
		String name1= t2[0];
		int wins1= Integer.parseInt(t2[1]);
		int loses1= Integer.parseInt(t2[2]);
		int draws1= Integer.parseInt(t2[3]);
		
		t[i]=new Team(name1,wins1,loses1,draws1);
		i++;
		}
		}
		InsertionSort ss =new InsertionSort();
		ss.sort(t);
		ss.printArray(t);
	}
}
