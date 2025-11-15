package com.test;

import java.util.Scanner;

import com.list.MyGraphDemo;

public class TestAdjescencyList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many vertices?");
		int v=sc.nextInt();
		MyGraphDemo g=new MyGraphDemo(v);
		storeGraph(g,v);
		g.printGraph();
		g.dfsTraversal(v);
		g.BfsTraversal(v);
	}

	private static void storeGraph(MyGraphDemo g, int v) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
			System.out.println("Is there a edge between"+i+"---"+j);
			int val =sc.nextInt();
			if(val>0)
			{
				g.addEdge(i,j);
			}
			
			}
		}
		
	}

}


/*
 Output
How many vertices?
7
Is there a edge between0---0
0
Is there a edge between0---1
1
Is there a edge between0---2
1
Is there a edge between0---3
1
Is there a edge between0---4
0
Is there a edge between0---5
0
Is there a edge between0---6
0
Is there a edge between1---0
1
Is there a edge between1---1
0
Is there a edge between1---2
0
Is there a edge between1---3
0
Is there a edge between1---4
1
Is there a edge between1---5
0
Is there a edge between1---6
0
Is there a edge between2---0
1
Is there a edge between2---1
0
Is there a edge between2---2
0
Is there a edge between2---3
0
Is there a edge between2---4
0
Is there a edge between2---5
1
Is there a edge between2---6
0
Is there a edge between3---0
1
Is there a edge between3---1
0
Is there a edge between3---2
0
Is there a edge between3---3
0
Is there a edge between3---4
0
Is there a edge between3---5
0
Is there a edge between3---6
1
Is there a edge between4---0
0
Is there a edge between4---1
1
Is there a edge between4---2
0
Is there a edge between4---3
0
Is there a edge between4---4
0
Is there a edge between4---5
0
Is there a edge between4---6
0
Is there a edge between5---0
0
Is there a edge between5---1
0
Is there a edge between5---2
1
Is there a edge between5---3
0
Is there a edge between5---4
0
Is there a edge between5---5
0
Is there a edge between5---6
0
Is there a edge between6---0
0
Is there a edge between6---1
0
Is there a edge between6---2
0
Is there a edge between6---3
1
Is there a edge between6---4
0
Is there a edge between6---5
0
Is there a edge between6---6
0


0-------
3----->
2----->
1----->
null
1-------
4----->
0----->
null
2-------
5----->
0----->
null
3-------
6----->
0----->
null
4-------
1----->
null
5-------
2----->
null
6-------
3----->
null
DFS 
pushed : 7
*/

