import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;


public class Algorithm {

  public List<Node> printPath(Node targetNode) {

    List<Node> pathList = new ArrayList<Node>();

    for (Node node = targetNode; node != null; node = node.getParentNode()) {
      pathList.add(node);
    }

    Collections.reverse(pathList);

    return pathList;
  }



  public double heuristic(Node node1, Node node2){
    return Math.abs( node1.getX() - node2.getX() ) + Math.abs( node2.getY() - node2.getY() );
  }


  public void aStarSearch(Node sourceNode, Node goalNode) {

    Set<Node> exploredNodes = new HashSet<Node>();

    PriorityQueue<Node> unexploredNodesQueue = new PriorityQueue<Node>();
    sourceNode.setgScore(0);
    unexploredNodesQueue.add(sourceNode);
    boolean found = false;



}














}
