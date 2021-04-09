package com.pkochuru.binarytree;

public class Node {

	int key;
	Node left;
	Node right;
	
	Node()
	{
		
	}
	
	public Node(int data)
	{
		this.key = data;
		this.left = this.right = null;
	}

	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return " " + key + " " + left + " " + right + " ";
	}
	
	
}
