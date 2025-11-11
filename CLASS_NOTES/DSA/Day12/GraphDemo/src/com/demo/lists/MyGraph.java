package com.demo.lists;

import com.demo.stacks.MyQueueList;
import com.demo.stacks.MyStackListGeneric;

public class MyGraph {
	MyLinkedList[] graph;

	public MyGraph(int v) {
		this.graph = new MyLinkedList[v];
		//initialize all linked list to null
		for(int i=0;i<this.graph.length;i++) {
			graph[i]=new MyLinkedList();
		}
	}
	
	public void addEdge(int source,int dest) {
		graph[source].addNode(dest);
	}
	
	public void printGraph() {
		for(int i=0;i<graph.length;i++) {
			System.out.print(i+"===>");
		    graph[i].displayList();
		}
	}
	
	public void dfsTraversal(int start) {
		System.out.println("DFS Traversal");
		//create a visited array of size = number of vertices
		boolean[] visited=new boolean[graph.length];
		//initialize all values to false
		for(int i=0;i<graph.length;i++) {
			visited[i]=false;
		}
		MyStackListGeneric<Integer> st=new MyStackListGeneric<Integer>();
		st.push(start);
		String dfs="";
		while(!st.isEmpty()) {
			int v=st.pop();
			if(!visited[v]) {  //visited[v]==false
				dfs+=v+",";
				visited[v]=true;
				//get all adjescent nodes of v
				int[] arr=new int[graph.length];
				for(int i=0;i<graph.length;i++) {
					arr[i]=-1;
				}
				graph[v].getAdjescentNodes(arr);
				for(int i=0;i<graph.length;i++) {
					if(arr[i]!=-1 && !visited[arr[i]]) {
						st.push(arr[i]);
					}
				}
				//System.out.println(st.displaydata());
				//System.out.println("==================");
		}
		System.out.println(dfs);	
		}
		
		
	}
	
	public void bfsTraversal(int start) {
		System.out.println("BFS Traversal");
		//create a visited array of size = number of vertices
		boolean[] visited=new boolean[graph.length];
		//initialize all values to false
		for(int i=0;i<graph.length;i++) {
			visited[i]=false;
		}
		MyQueueList que=new MyQueueList();
		que.enQueue(start);
		String bfs="";
		while(!que.isEmpty()) {
			int v=que.deQueue();
			if(!visited[v]) {  //visited[v]==false
				bfs+=v+",";
				visited[v]=true;
				//get all adjescent nodes of v
				int[] arr=new int[graph.length];
				for(int i=0;i<graph.length;i++) {
					arr[i]=-1;
				}
				graph[v].getAdjescentNodes(arr);
				for(int i=0;i<graph.length;i++) {
					if(arr[i]!=-1 && !visited[arr[i]]) {
						que.enQueue(arr[i]);
					}
				}
				;
		}
		System.out.println(bfs);	
		}
		
		
	}

}
