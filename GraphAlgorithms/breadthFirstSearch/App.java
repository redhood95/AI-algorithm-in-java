package breadthFirstSearch;

/* purpose of this class is to work as the main appilcation program to run the algorithm*/


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS bfs = new BFS();


		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);

		vertex1.addNeighbourVertex(vertex2);
		vertex1.addNeighbourVertex(vertex4);
		vertex4.addNeighbourVertex(vertex5);
		vertex2.addNeighbourVertex(vertex3);

		bfs.bfs(vertex1);
	}
}
