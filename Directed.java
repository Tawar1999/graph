import java.util.*;
import java.io.*;

class Directed
{

	// Edge class

	static class Edge
	{
		private int source;
		private int destination;
		private int weight;
		 
	public Edge(int source , int destination , int weight){
	    this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
	}

	// Graph class

  static class Graph{
      private int vertices;
	  ArrayList<ArrayList<Edge>> graph;

	  public Graph(int vertices){
	    this.vertices = vertices;
		graph = new ArrayList<>();

		for(int i = 0 ; i < vertices ; i++)
			graph.add(new ArrayList<>());
	  }

	  public void addEdge(int source , int destination , int weight){
	     Edge e = new Edge(source , destination , weight);
		 graph.get(source).add(e);
	  }

	  @Override
		  public String toString(){
	        String res = "";

			for(ArrayList<Edge> list : graph){
			   for(Edge l : list)
				   res = res + l.source + " to " + l.destination + " = " + l.weight + "\n";
			   }
		return res;
	  }
  }

      public static void main(String[] args) throws Exception{
	      int vertices = 6;
            Graph graph = new Graph(vertices);
            graph.addEdge(0, 1, 4);
            graph.addEdge(0, 2, 3);
            graph.addEdge(1, 3, 2);
            graph.addEdge(1, 2, 5);
            graph.addEdge(2, 3, 7);
            graph.addEdge(3, 4, 2);
            graph.addEdge(4, 0, 4);
            graph.addEdge(4, 1, 4);
            graph.addEdge(4, 5, 6);
           
		    System.out.println(graph);
	  }
 }



