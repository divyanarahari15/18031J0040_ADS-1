import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int n;
		Linkl l=new Linkl();
		Scanner s=new Scanner(System.in);
		String st[]=new String[3];
		String st1;
		for(int i = 0;s.hasNext();i++)
		{
			st1=s.nextLine();
			st=st1.split(" ");
			switch(st[0])
			{
			case "insertAt":
				/*l.insertAt(Integer.parseInt(st[1]),Integer.parseInt(st[2]));
				l.display();
				System.out.println();*/
				if(Integer.parseInt(st[1])>=0 && Integer.parseInt(st[1])<=l.size())
				{
				l.insertAt(Integer.parseInt(st[1]),Integer.parseInt(st[2]));
				l.display();
				
				}
				else
				{
					System.out.println("Can't insert at this position.");
				}
				break;
			case "reverse":
				l.reverse(0);
				l.display();
				break;
			}
		}
	}
}
