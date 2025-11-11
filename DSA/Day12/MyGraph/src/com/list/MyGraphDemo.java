package com.list;


import com.stack.MyGenericStackList;
import com.stack.MyQueueList;
public class MyGraphDemo {
	MyLinkedList [] graph;
	
	public MyGraphDemo(int v)
	{
		this.graph=new MyLinkedList[v];
		
		for(int i=0;i<this.graph.length;i++)
		{
			graph[i]=new MyLinkedList();
		}
	}
	
	public void addEdge(int source,int dest)
	{
		graph[source].addNode(dest);
	}
	
	public void printGraph()
	{
		for(int i=0;i<graph.length;i++)
		{
			System.out.println(i+"-------");
			graph[i].displayList();
		}
	}
	
	public void dfsTraversal(int start)
	{
		System.out.println("DFS ");
		boolean [] visited=new boolean [graph.length];
		for(int i=0;i<graph.length;i++)
		{
			visited[i]=false;	
		}
		MyGenericStackList<Integer> st =new MyGenericStackList<Integer>();
		st.push(start);
		String dfs="";
		while(!st.isEmpty()) {
			int v=st.pop();
			if(visited[v]==false) {  
				dfs+=v+",";
				visited[v]=true;
			
				int[] arr=new int[graph.length];
				for(int i=0;i<graph.length;i++) {
					arr[i]=-1;
				}
				graph[v].addAdjescentNodes(arr);
				for(int i=0;i<graph.length;i++) {
					if(arr[i]!=-1 && !visited[arr[i]]) {
						st.push(arr[i]);
					}
				}
				
			}
			System.out.println(dfs);
			
			
		}
		
		
	}
	
	public void BfsTraversal(int start)
	{
		System.out.println("BFS Traversal");
		boolean[] visited =new boolean [graph.length];
		for(int i=0; i<graph.length ; i++)
		{
			visited[i]=false;
		}
		
		MyQueueList que= new MyQueueList();
		que.enQueue(start);
		String bfs="";
		while(!que.isEmpty())
		{
			int v=que.deQueue();
			if(!visited[v])
			{
				bfs+=v+",";
				visited[v]=true;
				int [] arr=new int[graph.length];
				for(int i=0;i<graph.length;i++)
				{
					arr[i]=-1;
				}
				graph[v].addAdjescentNodes(arr);
				for(int i=0;i<graph.length;i++)
				{
					if(arr[i]!=-1 && !visited[arr[i]])
					{
						que.enQueue(arr[i]);
					}
				}
			}
			System.out.println(bfs);
		}
	}
}
