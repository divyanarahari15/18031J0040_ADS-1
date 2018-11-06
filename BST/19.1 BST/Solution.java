import java.util.NoSuchElementException;
import java.util.Scanner;
import module15.QueueDemo;

public class BinarySearchTree20<Key extends Comparable<Key>, Value> {
	private Node root;
	private class Node
	{
		private Key key;
		private Value val;
		private Node left,right;
		public int size;
		public Node(Key key,Value val)
		{
			this.key=key;
			this.val=val;
			
		}
	}
	public boolean isEmpty() {
        return size() == 0;
    }
    public int size() {
        return size(root);
    }
    private int size(Node x) {
        if (x == null) return 0;
        else return x.size;
    }
    public void put(Key key, Value value)
    { 
    root = put(root, key, value); 
    }
    private Node put(Node x, Key key, Value val)
    {
     if (x == null) 
   	  return new Node(key, val);
     int cmp = key.compareTo(x.key);
     if (cmp < 0) x.left = put(x.left, key, val);
     else if (cmp > 0) x.right = put(x.right, key, val);
     else x.val = val;
     return x;
    }
    public Value get(Key key) {
        return get(root, key);
    }
    private Value get(Node x, Key key) {
        if (key == null) throw new IllegalArgumentException("calls get() with a null key");
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else              return x.val;
    }
    public Key min() {
        if (isEmpty()) throw new NoSuchElementException("calls min() with empty symbol table");
        return min(root).key;
    } 
    private Node min(Node x) { 
        if (x.left == null) 
        	return x; 
        else               
        	return min(x.left); 
    } 
    public Key max()
    {
    	if (isEmpty()) throw new NoSuchElementException("calls min() with empty symbol table");
        return max(root).key;
    }
    private Node max(Node x){
    	if(x.right==null)
    		return x;
    	else
    		return max(x.right);
    }
    public Key floor(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to floor() is null");
        if (isEmpty()) throw new NoSuchElementException("calls floor() with empty symbol table");
        Node x = floor(root, key);
        if (x == null) return null;
        else return x.key;
    } 
    private Node floor(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp <  0) return floor(x.left, key);
        Node t = floor(x.right, key); 
        if (t != null) return t;
        else return x; 
    } 
    public Key ceiling(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to ceiling() is null");
        if (isEmpty()) throw new NoSuchElementException("calls ceiling() with empty symbol table");
        Node x = ceiling(root, key);
        if (x == null) return null;
        else return x.key;
    }
    private Node ceiling(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) { 
            Node t = ceiling(x.left, key); 
            if (t != null) return t;
            else return x; 
        } 
        return ceiling(x.right, key); 
    }
    public Key select(int k) {
        if (k < 0 || k >= size()) {
            throw new IllegalArgumentException("argument to select() is invalid: " + k);
        }
        Node x = select(root, k);
        return x.key;
    }
    private Node select(Node x, int k) {
        if (x == null) return null; 
        int t = size(x.left); 
        if      (t > k) return select(x.left,  k); 
        else if (t < k) return select(x.right, k-t-1); 
        else            return x; 
    } 
    public int rank(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to rank() is null");
        return rank(key, root);
    } 
    private int rank(Key key, Node x) {
        if (x == null) return 0; 
        int cmp = key.compareTo(x.key); 
        if      (cmp < 0) return rank(key, x.left); 
        else if (cmp > 0) return 1 + size(x.left) + rank(key, x.right); 
        else              return size(x.left); 
    } 
    public Iterable<Key> keys() {
        QueueDemo<Key> keys = new QueueDemo<Key>();
        QueueDemo<Node> queue = new QueueDemo<Node>();
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node x = queue.dequeue();
            if (x == null) continue;
            keys.enqueue(x.key);
            queue.enqueue(x.left);
            queue.enqueue(x.right);
        }
        return keys;
    }
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("calls delete() with a null key");
        root = delete(root, key);
          }

    private Node delete(Node x, Key key) {
        if (x == null) return null;

        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left  = delete(x.left,  key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else { 
            if (x.right == null) return x.left;
            if (x.left  == null) return x.right;
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        } 
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    } 
    public void deleteMin() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");
        root = deleteMin(root);
        
    }

    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void deleteMax() {
        if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");
        root = deleteMax(root);
        
    }
    private Node deleteMax(Node x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    public static void main(String[] args)
    {
   	 BinarySearchTree20<String, Integer> st = new BinarySearchTree20<String, Integer>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
     
        for(int i=0;i<n;i++) {
   	 String s=sc.nextLine();
   	 String temp[]=s.split(" ");
   	 String key=temp[0];
   	 int val=Integer.parseInt(temp[1]);
   	 st.put(key, val);
   	
     }
     for (String s : st.keys())
     {
   	  System.out.println("Key : "+s+" Value : "+st.get(s));
     }
     System.out.println("max"+st.max());
     System.out.println("Floor"+st.floor("C"));
    }
    
}
