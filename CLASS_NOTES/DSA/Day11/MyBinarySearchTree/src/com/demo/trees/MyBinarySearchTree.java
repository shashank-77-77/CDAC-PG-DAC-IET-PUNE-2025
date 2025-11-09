package com.demo.trees;

public class MyBinarySearchTree {
    Node root;
    class Node{
    	int data;
    	Node left;
    	Node right;
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
    	
    }
	public MyBinarySearchTree() {
		root=null;
	}
    
	public void insertNode(int key) {
		root=insertData(root,key);
	}

	private Node insertData(Node root, int key) {
		Node newNode=new Node(key);
		//tree is empty, terminating condition for recurssion
		if(root==null) {
			root=newNode;
			return root;
		}else {
			if(key<root.data) {
				root.left=insertData(root.left,key);
			}else {
				root.right=insertData(root.right,key);
			}
			return root;
		}
		
	}
	
	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+", ");
			inorderTraversal(root.right);
		}
		
	}
	
	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data+", ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		
	}
	
	public void postorder() {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+", ");
		}
		
	}
	
	public void deleteNode(int key) {
		root=deleteData(root,key);
	}

	private Node deleteData(Node root, int key) {
		if(root==null) {
			return root;
		}
		//traverse to find the node
		if(key<root.data) {
			root.left=deleteData(root.left,key);
		}else if(key>root.data) {
			root.right=deleteData(root.right,key);
		}else {
			//found the node to delete
			//1. the node is leaf node
			if(root.left==null && root.right==null) {
				return null;
			}
			
			//2. the node has 1 child
			else if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}
			
			//3. the node has 2 children
			root.data=minvalue(root.right);
			root.right=deleteData(root.right,root.data);
		}
		return root;
	}

	private int minvalue(Node root) {
		int min=root.data;
		while(root.left!=null) {
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
	
	public boolean search(int key) {
		return searchBinaryTree(root,key);
	}
	
	public boolean searchNonRecussive(int key) {
		return searchBinaryTreeNonRecurssive(root,key);
	}

	private boolean searchBinaryTreeNonRecurssive(Node root, int key) {
		if(root!=null) {
			Node temp=root;
			while(temp!=null) {
				if(temp.data==key) {
					System.out.println(key+ " data found");
					return true;
				}else if(key<temp.data) {
					temp=temp.left;
				}else {
					temp=temp.right;
				}
			}
		}
		System.out.println(key +" not found");
		return false;
	}

	private boolean searchBinaryTree(Node root, int key) {
		if(root!=null) {
			if(root.data==key) {
				System.out.println(key+ " data found");
				return true;
			}else if(key<root.data) {
				return searchBinaryTree(root.left,key);
			}else {
				return searchBinaryTree(root.right,key);
			}
		}
		System.out.println(key+ " data not found");
		return false;
	}
	
}











