import java.util.Scanner;

import org.w3c.dom.Node;

public	class BinaryTree
	{
	Node root;
	
	static class Node
	{
	    int data;
	    Node left, right;
	  
	    Node(int item)
	    {
	        data = item;
	        left = right =  null;
	    }
	}
	 boolean printAncestors(Node node, int target)
	    {
	        if (node == null)
	            return false;
	  
	        if (node.data == target)
	            return true;
	  
	        if (printAncestors(node.left, target)
	                || printAncestors(node.right, target))
	        {
	            System.out.print(node.data + " ");
	            return true;
	        }
	  
	        
	        return false;
	    }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		  tree.root = new Node(8);
	        tree.root.left = new Node(3);
	        tree.root.right = new Node(10);
	        tree.root.left.left = new Node(1);
	        tree.root.left.right = new Node(6);
	        tree.root.left.right.left = new Node(4);
	        tree.root.left.right.right = new Node(7);
	        tree.root.right.right = new Node(14);
	        tree.root.right.right.left = new Node(13);
	        
	        System.out.println(" Please enter the node whose Ancector wants to print:");
	        int n=sc.nextInt();
	        tree.printAncestors(tree.root,n);
	      

	}

}
