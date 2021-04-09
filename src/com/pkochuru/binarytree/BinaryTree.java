package com.pkochuru.binarytree;

import java.io.PrintStream;

public class BinaryTree {
	
	

	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		
		Node l1 = new Node(4);
		Node r1 = new Node(6);
		n1.setLeft(l1);
		n1.setRight(r1);
		
		Node l2 = new Node(12);
		Node r2 = new Node(4);
		l1.setLeft(l2);
		l1.setRight(r2);
		
		Node l3 = new Node(5);
		Node r3 = new Node(9);
		r2.setLeft(l3);
		r2.setRight(r3);
		
		Node l4 = new Node(43);
		Node r4= new Node(16);
		l2.setLeft(l4);
		l2.setRight(r4);
		
		
		System.out.println(n1.toString());
		//PrintStream out = null;
		
		StringBuilder sb = new StringBuilder();
		
		PretraverseTree(sb, n1);
		
		System.out.println("Pre-order Traversal fo the Binary tree - " + sb.toString());
		
		sb.setLength(0);
		
		IntraverseTree(sb, n1);
		
		System.out.println("In-order Traversal fo the Binary tree - " + sb.toString());
		
		System.out.println("Size of the Binary tree is " + size(n1));
		
		System.out.println("Maximum number in the Binary tree is " + findmax(n1));
		
		System.out.println("Minimum number in the Binary tree is " + findmin(n1));
		
	}
	
	public static int findmax(Node root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			int result = root.key;
			int leftres = findmax(root.left);
			int rightres = findmax(root.right);
			
			if(leftres > result)
				result = leftres;
			else if(rightres > result)
				result= rightres;
			
			return result;
		}
	}
	
	public static int findmin(Node root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			int result = root.key;
			int leftres = findmax(root.left);
			int rightres = findmax(root.right);
			
			if(leftres < result)
				result = leftres;
			else if(rightres < result)
				result= rightres;
			
			return result;
		}
	}
	public static int size(Node root)
	{
		if(root==null)
			return 0;
		else
			return(size(root.left) + 1 + size(root.right));
	}
	
	public static void IntraverseTree(StringBuilder sb, Node root)
	{
		if(root!=null)
		{
			IntraverseTree(sb, root.getLeft());
			
			sb.append("\n");
			
			sb.append(root.getKey());
			IntraverseTree(sb, root.getRight());
		}
	}
	
	public static void PretraverseTree(StringBuilder sb, Node root)
	{
		if(root!=null)
		{
			sb.append(root.getKey());
			sb.append("\n");
			
			PretraverseTree(sb, root.getLeft());
			PretraverseTree(sb, root.getRight());
		}
	}

}
