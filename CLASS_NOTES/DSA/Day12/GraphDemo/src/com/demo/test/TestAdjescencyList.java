package com.demo.test;

import java.util.Scanner;

import com.demo.lists.MyGraph;

public class TestAdjescencyList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many vertices?");
		int v=sc.nextInt();	
		MyGraph g=new MyGraph(v);
		storeGraph(g,v);
		g.printGraph();
		g.dfsTraversal(0);
		g.bfsTraversal(0);
		
	}

	private static void storeGraph(MyGraph g,int v) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("Is there a edge between "+i+"----"+j);
				int val=sc.nextInt();
				//for unweighted graph
				if(val>0) {
					g.addEdge(i, j);
					//for weighted graph
					//g.addEdge(i, j,weight);
				}
				
			}
		}
		
	}

}
