

import java.util.NoSuchElementException;
import java.util.Scanner;

public class pc42<Key extends Comparable<Key>, Value>
{
 private Node root = null;
 
 private class Node
 {
 private Key key;
 private Value val;
 private Node left;
 private Node right;
 
 public Node(Key key2, Value val2)
 {
		
	 this.key=key2;
	 this.val=val2;
	}

public int compareTo(pc42<Key, Value>.Node root) {
	// TODO Auto-generated method stub
	return 0;
}
 }
 
 public boolean isEmpty()
 { 
 return root == null; 
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
 public Value get(Key key)
 { 
 return get(root, key);
 }
 
 public boolean contains(Key key)
 { 
   return get(key) != null; 
 }
 private Value get(Node x, Key key)
 {
  if (x == null) 
	  return null;
  int cmp = key.compareTo(x.key);
  if (cmp < 0) 
	  return get(x.left, key);
  else if (cmp > 0) 
	  return get(x.right, key);
  else if (cmp == 0) 
	  return x.val;
return null;
 }
 public Iterable<Key> keys()
 { 
 QueueDemo<Key> q = new QueueDemo<Key>();
 inorder(root, q);
 return q;
 
 }
 private void inorder(Node x, QueueDemo<Key> queue)
 {
  if (x == null) 
	  return;
  inorder(x.left, queue);
  queue.enqueue(x.key);
  inorder(x.right, queue);
 }
 
 
 public Key max() {
     if (isEmpty()) throw new NoSuchElementException("called max() with empty symbol table");
     return max(root).key;
 } 
 private Node max(Node x) {
     if (x.right == null) 
    	 return x; 
     else                 
    	 return max(x.right); 
 } 
 public Key floor(Key key) {
     if (key == null) throw new IllegalArgumentException("argument to floor() is null");
     if (isEmpty()) throw new NoSuchElementException("called floor() with empty symbol table");
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
 
}

