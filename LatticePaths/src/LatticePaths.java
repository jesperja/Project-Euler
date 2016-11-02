import java.util.ArrayList;
import java.util.TreeMap;

/**
 Starting in the top left corner of a 2×2 grid, and only being able to
 move to the right and down, there are exactly 6 routes to the bottom
 right corner.


 How many such routes are there through a 20×20 grid?
 */
public class LatticePaths {

    public static ArrayList<Node> createGraph(final int size){
        final int numberOfNodes = size * size;
        final ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(0, new Node(0));
        for (int i = 1; i < numberOfNodes; i++){
            Node node = new Node(i);
            nodes.add(i, node);
            if (i < size){
                node.getParents().add(nodes.get(i - 1));
            }else if (i % size == 0){
                node.getParents().add(nodes.get(i - size));
            }else{
                node.getParents().add(nodes.get(i - 1));
                node.getParents().add(nodes.get(i - size));
            }
        }
        return nodes;
    }

    public static long calculateLatticePaths(final int size){
        final ArrayList<Node> graph = createGraph(size);
        long[] pathArray = new long[size * size];
        pathArray[0] = 1;
        for (int i = 1; i < size * size; i++){
//            for (Node node : graph.get(i).getParents()) {
//                pathArray[i] = pathArray[i] + pathArray[node.getNumber()];
//            }

            // Alternate approach without needing a graph
            if (i < size){
                pathArray[i] = pathArray[i - 1];
            }else if (i % size == 0){
                pathArray[i] = pathArray[i - size];
            }else{
                pathArray[i] = pathArray[i - 1] + pathArray[i - size];
            }
        }
        return pathArray[(size * size) - 1];
    }
}
