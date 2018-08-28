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



  















}
