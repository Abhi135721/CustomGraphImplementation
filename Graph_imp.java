import java.util.ArrayList;

class Graphnode{
	int value;
	ArrayList<Graphnode> neighbours;
	boolean isVisited;
	Graphnode(int val){
		value = val;
		neighbours  = new ArrayList<Graphnode>();
		isVisited = false;
	}
}
public class Graph_imp {
	static ArrayList<Graphnode> nodesList = new ArrayList<Graphnode>();
	public static void addvertex(int node){
		nodesList.add(new Graphnode(node));
	}
	public static void addEdge(Graphnode source , Graphnode destination){
		if(nodesList.contains(source) && nodesList.contains(destination)){
			source.neighbours.add(destination);
			
			// Add this line incase of an undirected graph
			//destination.neighbours.add(source);
		}
	}
	public static void addWeightedEdge(Graphnode source , Graphnode destination , int weight){
		if(nodesList.contains(source) && nodesList.contains(destination)){
			source.neighbours.add(destination);
			
		}	
	}
	public static void printGraph(){
		System.out.println("All the nodes present in the graph are: ");
		for(Graphnode i : nodesList){
			System.out.print(i.value + " ");
		}
		
		System.out.println("\nConnections between the nodes are");
		
		for(Graphnode i : nodesList){
			if(i.neighbours.size() > 0){
				System.out.print(i.value  + "  :  ");
				for(Graphnode n : i.neighbours){
					System.out.print(n.value + " ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
			addvertex(1);
			addvertex(2);
			addvertex(3);
			addvertex(4);
			addvertex(5);
			addvertex(6);
			addvertex(7);
			addvertex(8);
			
			addEdge(nodesList.get(0) , nodesList.get(1));
			addEdge(nodesList.get(1) , nodesList.get(2));
			addEdge(nodesList.get(2) , nodesList.get(3));
			addEdge(nodesList.get(3) , nodesList.get(4));
			addEdge(nodesList.get(4) , nodesList.get(5));
			addEdge(nodesList.get(5) , nodesList.get(6));
			addEdge(nodesList.get(6) , nodesList.get(7));
			addEdge(nodesList.get(7) , nodesList.get(0));
			
			printGraph();
			//System.out.println("BFS traversal is: ");
			//BFS_implementation.bfs_traversal(nodesList , nodesList.get(0));
			
			System.out.println("DFS traversal is: ");
			DFS_implementaiton.dfs_traversal(nodesList , nodesList.get(0));
			
	}
}
