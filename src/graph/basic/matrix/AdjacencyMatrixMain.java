package graph.basic.matrix;

import java.util.ArrayList;

public class AdjacencyMatrixMain {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);

        g.addUndirectedEdge('A', 'B');
        g.addUndirectedEdge('A', 'D');
        g.addUndirectedEdge('A', 'E');
        g.addUndirectedEdge('B', 'C');
        g.addUndirectedEdge('B', 'D');
        g.addUndirectedEdge('C', 'D');
        g.addUndirectedEdge('D', 'E');

        System.out.println(g);
    }
}
