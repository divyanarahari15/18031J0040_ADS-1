package module1;

public class QuickUnion
{
	private int[] id;
	public QuickUnion(int N)
	{
		id = new int[N];
		for(int i = 0 ; i < N ; i++)
			id[i] = i ;
	}
	@SuppressWarnings("unused")
	private int Root(int i)
	{
		while(i!=id[i])
		{
			i=id[i];
			
		}
		return i;
	}
		public boolean Find(int p , int q)
		{
			return id[p] == id[q];
		}
		public void union(int p , int q)
		{
			int pid = id[p];
			int qid = id[q];
			id[pid]=qid;
			for(int i = 0 ; i<10 ; i++)
			{
				System.out.print(id[i] + " ");	
		    }
			System.out.println("");
		}
			
	public static void main(String args[])
	{
		QuickUnion q = new QuickUnion(10);
		q.union(9,0);
		q.union(3,4);
		q.union(5,8);
		q.union(7,2);
		q.union(2,1);
		q.union(5,7);
		q.union(0,3);
		q.union(4,2);
	}
}
