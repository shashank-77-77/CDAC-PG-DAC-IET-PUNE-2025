package com.test;

import java.util.Scanner;

public class TestAdjescencyMatrix {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println( "How many Vertices");
			int v=sc.nextInt();
			int[][] mygraph = new int[v][v];
			storeGraph(mygraph);
			displayMatrix(mygraph);
	}


	private static void displayMatrix(int[][] mygraph) {
		for(int i=0;i<mygraph.length;i++)
		{
			for(int j=0;j<mygraph[0].length;j++)
			{
				System.out.print(mygraph[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	private static void storeGraph(int[][] mygraph) {
		Scanner sc = new Scanner (System.in);
		for(int i=0; i<mygraph.length ; i++)
		{
			for(int j=0 ; j<mygraph[0].length ;j++) {
				System.out.println("Is There a Edge Between"+i+"----"+j);
				mygraph[i][j]=sc.nextInt();
						
			}
		}
		
	}	
}
/*
How many Vertices
7
Is There a Edge Between0----0
0
Is There a Edge Between0----1
1
Is There a Edge Between0----2
1
Is There a Edge Between0----3
1
Is There a Edge Between0----4
0
Is There a Edge Between0----5
0
Is There a Edge Between0----6
0
Is There a Edge Between1----0
1
Is There a Edge Between1----1
0
Is There a Edge Between1----2
0
Is There a Edge Between1----3
0
Is There a Edge Between1----4
1
Is There a Edge Between1----5
0
Is There a Edge Between1----6
0
Is There a Edge Between2----0
1
Is There a Edge Between2----1
0
Is There a Edge Between2----2
0
Is There a Edge Between2----3
0
Is There a Edge Between2----4
0
Is There a Edge Between2----5
1
Is There a Edge Between2----6
0
Is There a Edge Between3----0
1
Is There a Edge Between3----1
0
Is There a Edge Between3----2
0
Is There a Edge Between3----3
0
Is There a Edge Between3----4
0
Is There a Edge Between3----5
0
Is There a Edge Between3----6
1
Is There a Edge Between4----0
0
Is There a Edge Between4----1
1
Is There a Edge Between4----2
0
Is There a Edge Between4----3
0
Is There a Edge Between4----4
0
Is There a Edge Between4----5
0
Is There a Edge Between4----6
0
Is There a Edge Between5----0
0
Is There a Edge Between5----1
0
Is There a Edge Between5----2
1
Is There a Edge Between5----3
0
Is There a Edge Between5----4
0
Is There a Edge Between5----5
0
Is There a Edge Between5----6
0
Is There a Edge Between6----0
0
Is There a Edge Between6----1
0
Is There a Edge Between6----2
0
Is There a Edge Between6----3
1
Is There a Edge Between6----4
0
Is There a Edge Between6----5
0
Is There a Edge Between6----6
0


0	1	1	1	0	0	0	
1	0	0	0	1	0	0	
1	0	0	0	0	1	0	
1	0	0	0	0	0	1	
0	1	0	0	0	0	0	
0	0	1	0	0	0	0	
0	0	0	1	0	0	0	
*/
