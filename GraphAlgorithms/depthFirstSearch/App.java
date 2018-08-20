package depthFirstSearch;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		
		List<Vertex> list = new ArrayList<>();
		
		vertex1.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex3);
		vertex4.addNeighbour(vertex4);
		vertex2.addNeighbour(vertex5);
		
		list.add(vertex1);
		list.add(vertex2);
		list.add(vertex3);
		list.add(vertex4);
		list.add(vertex5);
		
		DFS dfs = new DFS();
		dfs.dfs(list);

	}

}
