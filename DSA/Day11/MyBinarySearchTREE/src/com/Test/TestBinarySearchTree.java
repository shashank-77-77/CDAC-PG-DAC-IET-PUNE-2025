package com.Test;

import com.Trees.MyBinarySearchTree;

public class TestBinarySearchTree 
{

	public static void main(String[] args)
	{
		MyBinarySearchTree bst=new MyBinarySearchTree();
		
		bst.insertNode(35);
		bst.insertNode(155);
		bst.insertNode(177);
		bst.insertNode(185);
		bst.insertNode(105);
		bst.insertNode(401);
		bst.insertNode(328);
		bst.insertNode(455);
		bst.insertNode(333);
		
		System.out.println("Inorder");
		bst.inorder();
		System.out.println("preorder");
		bst.preorder();
		System.out.println("postorder");
		bst.postorder();
		
		bst.search(33);
		bst.searchNonRecussive(333);
		bst.search(38);
		
		bst.deleteNode(177);
		bst.inorder();
		bst.deleteNode(105);
		bst.inorder();
		bst.deleteNode(328);
		bst.inorder();

	}

}
