package breadthFirstSearch;
import java.util.*;

public class BFS {
	
	
	public void bfs(Vertex root) {
		
		Queue<Vertex> queue = new LinkedList();
		
		root.setVisited(true);
		queue.add(root);
		
	}

}
