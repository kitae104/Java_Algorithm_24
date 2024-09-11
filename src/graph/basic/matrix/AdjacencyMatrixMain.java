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
        g.addUndirectedEdge('A', 'C');
        g.addUndirectedEdge('A', 'D');
        g.addUndirectedEdge('B', 'E');
        g.addUndirectedEdge('C', 'D');
        g.addUndirectedEdge('D', 'E');

        System.out.println("==== 인접 행렬 ====");
        System.out.println(g);

        System.out.println("==== BFS ====");
        g.bfs();
        System.out.println();

        // visited 초기화 - 이전 작업에 의해 노드가 방문되었으므로 초기화 필요
        for (GraphNode node : nodeList) {
            node.setVisited(false);
        }

        System.out.println("\n==== DFS ====");
        g.dfs();
    }
}
