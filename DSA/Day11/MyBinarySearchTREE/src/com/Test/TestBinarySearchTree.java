package com.Test;

import com.Trees.MyBinarySearchTree;

public class TestBinarySearchTree 
{

	public static void main(String[] args)
	{
		MyBinarySearchTree bst=new MyBinarySearchTree();
		
		bst.insertNode(95);
		bst.insertNode(145);
		bst.insertNode(187);
		bst.insertNode(185);
		bst.insertNode(905);
		bst.insertNode(401);
		bst.insertNode(328);
		bst.insertNode(485);
		bst.insertNode(333);
		
		System.out.println("Inorder");
		bst.inorder();
		System.out.println("preorder");
		bst.preorder();
		System.out.println("postorder");
		bst.postorder();
		
		bst.search(401);
		bst.searchNonRecussive(328);
		bst.search(485);
		
		bst.deleteNode(145);
		bst.inorder();
		bst.deleteNode(185);
		bst.inorder();
		bst.deleteNode(328);
		bst.inorder();

	}

}


//Output :
 
//Inorder

//95, 145, 185, 187, 328, 333, 401, 485, 905, 

//preorder

//95, 145, 187, 185, 905, 401, 328, 333, 485, 

//postorder

//185, 333, 328, 485, 401, 905, 187, 145, 95, 


//401 data found
//328 data found
//485 data found


//95, 185, 187, 328, 333, 401, 485, 905, 
//95, 187, 328, 333, 401, 485, 905, 
//95, 187, 333, 401, 485, 905, 