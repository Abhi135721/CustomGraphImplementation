import java.util.ArrayList;
import java.util.Stack;

public class DFS_implementaiton {
	
	public static void dfs_traversal(ArrayList<Graphnode> graph , Graphnode source){
		Stack<Graphnode> S = new Stack<Graphnode>();
		
		S.push(source);
		
		source.isVisited = true;
		
		while(!S.isEmpty()){
			Graphnode v = S.peek();
			S.pop();
			System.out.print(v.value + " ");
			for(Graphnode w : v.neighbours){
				if(w.isVisited == false){
					S.push(w);
					w.isVisited = true;
				}
			}
			
		}
	}
	
}
