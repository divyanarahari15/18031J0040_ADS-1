package module1;

public class WeightedUnion
{
	private int[] id;
	public WeightedUnion(int N)
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
			//int[] sz=null ;
			if(id[pid]<id[qid])
			{
				id[pid]=qid;
				//id[qid]=id[pid];
			}
			else
			{
				id[qid]=pid;
				//sz[qid]=sz[pid];
			}
			for(int i = 0 ; i<10 ; i++)
			{
				System.out.print(id[i] + " ");	
		    }
			System.out.println("");
		}
			
	public static void main(String args[])
	{
		WeightedUnion q = new WeightedUnion(10);
		System.out.println("9,0");
		q.union(9,0);
		System.out.println("3,4");
		q.union(3,4);
		System.out.println("5,8");
		q.union(5,8);
		System.out.println("7,2");
		q.union(7,2);
		System.out.println("2,1");
		q.union(2,1);
		System.out.println("5,7");
		q.union(5,7);
		System.out.println("0,3");
		q.union(0,3);
		System.out.println("4,2");
		q.union(4,2);
	}
}
