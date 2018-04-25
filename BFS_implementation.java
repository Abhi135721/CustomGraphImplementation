import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_implementation {
	public static void bfs_traversal(ArrayList<Graphnode> graph , Graphnode source){
		Queue<Graphnode> Q = new LinkedList<Graphnode>();
		Q.add(source);
		
		source.isVisited = true;
		
		while(!Q.isEmpty()){
			Graphnode v = Q.remove();
			System.out.print(v.value + " ");
			for(Graphnode w : v.neighbours){
				if(w.isVisited == false){
					Q.add(w);
					w.isVisited = true;
				}
			}
		}
		
	}
	public static void main(String [] args){
		
	}
}
