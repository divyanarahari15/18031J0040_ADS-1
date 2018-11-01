import java.util.Scanner;

class BookDetails implements Comparable {
    
    private String name;
    
    private String author;
   
    private float price;
    
    BookDetails( String bookname, String bookauthor,  float bookprice) {
        this.name = bookname;
        this.author = bookauthor;
        this.price = bookprice;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAuthor() {
        return this.author;
    }
   
    public float getPrice() {
        return this.price;
    }
    
    public int compareTo( Object object) {
        BookDetails that = (BookDetails) object;
        return this.name.compareTo(that.name);
    }
}

class BinarySearchTree<Key extends Comparable<Key>, Value> {
    
    private Node root;
   
    private  class Node {
       
        private Key key;
        private Value val;
        private Node left,right;
            
        private Node( Key key1,  Value val1) {
            this.key = key1;
            this.val = val1;
            left = null;
            right = null;
        }
    }
    BinarySearchTree() {
        root = null;
    }
    public Value get( Key key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else if (cmp == 0) {
                return x.val;
            }
        }
        return null;
    }
    
    public void put( Key key, Value val) {
        root = put(root, key, val);
    }
    
    private Node put(Node x,Key key,Value val)
    {
    	if(x==null)
    	{
    		return new Node(key, val);
    	}
    	int cmp=key.compareTo(x.key);
    	if(cmp<0)
    		x.left=put(x.left,key,val);
    	else if(cmp>0)
    		x.right=put(x.right,key,val);
    	else
    		x.val=val;
    	return x;
    }
}
public class Solution {
    
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bstobj = new BinarySearchTree();
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                BookDetails deobj = new BookDetails(tokens[1],
                 tokens[2], Float.parseFloat(tokens[2 + 1]));
                bstobj.put(deobj, Integer.parseInt(tokens[2 + 2]));
                break;
            case "get":
                deobj = new BookDetails(tokens[1], tokens[2],
                    Float.parseFloat(tokens[2 + 1]));
                if (bstobj.get(deobj) == null) {
                    System.out.println("null");
                } else {
                    System.out.println(bstobj.get(deobj));
                }
                break;
            default:
                break;
            }
        }
    }
}