package module10;

class Problem2
{
public String Star(String a)
{
if(a.length()==1)
		return a;

	if(a.charAt(0)==a.charAt(1))
		return  (a.charAt(0))+"*"+Star(a.substring(1));
	return a.charAt(0)+Star(a.substring(1));
}
public static void main(String args[])
{
Problem2 p=new Problem2();
System.out.println(p.Star("xxxx"));
}
}

	
