


 
public class AddLargeNumbers {
	   
    public static LinkedList numberToDigits(String number) {
	Scanner scan=new Scanner(System.in);
    	LinkedList ob= new LinkedList();
    	char [] num =number.toCharArray();
    	for(int i =num.length-1; i>=0;i--)
    	{
    		int k = scan.nextInt();
    		ob.push(k);
    	}
    	return ob;
    }

    public static String digitsToNumber(LinkedList list) {
    	String str="";
    	while(!list.isEmpty())
    	{
    		str=str+list.peek();
    		list.pop();
    	}
    	return str;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList ll = new LinkedList();
    	while((!list1.isEmpty())||(!list2.isEmpty()))
    	{
    		if((int)ll.peek()==0)
    		{
    			ll.push((int)list1.peekLast()+(int)list2.peekLast());
    			list1.pop();
    			list2.pop();
    		}
    		else
    		{
    			ll.push((int)list1.peekLast()+(int)list2.peekLast()+1);
    			list1.pop();
    			list2.pop();
    		}
    	}
    			return ll;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}