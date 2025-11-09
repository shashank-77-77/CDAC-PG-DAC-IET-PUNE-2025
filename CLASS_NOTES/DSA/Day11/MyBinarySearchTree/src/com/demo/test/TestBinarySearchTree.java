package com.demo.test;

import com.demo.trees.MyBinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		MyBinarySearchTree bst=new MyBinarySearchTree();
		bst.insertNode(31);
		bst.insertNode(15);
		bst.insertNode(17);
		bst.insertNode(18);
		bst.insertNode(10);
		bst.insertNode(40);
		bst.insertNode(32);
		bst.insertNode(45);
		bst.insertNode(33);
		System.out.println("Inorder");
		bst.inorder();
		System.out.println("preorder");
		bst.preorder();
		System.out.println("postorder");
		bst.postorder();
		
		bst.search(33);
		bst.searchNonRecussive(31);
		bst.search(38);
		
		bst.deleteNode(18);
		bst.inorder();
		bst.deleteNode(32);
		bst.inorder();
		bst.deleteNode(15);
		bst.inorder();

	}

}
