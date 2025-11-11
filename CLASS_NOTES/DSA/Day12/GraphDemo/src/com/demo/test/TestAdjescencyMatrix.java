package com.demo.test;

import java.util.Scanner;

public class TestAdjescencyMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many vertices?");
		int v=sc.nextInt();
		int[][] mygraph=new int[v][v];
		storeGraph(mygraph);
		displayMatrix(mygraph);

	}

	private static void displayMatrix(int[][] mygraph) {
		for(int i=0;i<mygraph.length;i++) {
			for(int j=0;j<mygraph[0].length;j++) {
				System.out.print(mygraph[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	private static void storeGraph(int[][] mygraph) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<mygraph.length;i++) {
			for(int j=0;j<mygraph[0].length;j++) {
				System.out.println("Is there a edge between "+i+"----"+j);
				mygraph[i][j]=sc.nextInt();
				
			}
		}
		
	}

}
