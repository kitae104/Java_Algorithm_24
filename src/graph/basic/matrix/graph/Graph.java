package graph.basic.matrix.graph;

import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>(); // 그래프 노드 리스트
    int[][] adjacencyMatrix; // 인접행렬

    // 생성자
    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    // 무방향 그래프 간선 추가
    public void addUndirectedEdge(int i, int j){
        i = i - 'A';
        j = j - 'A';
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    // 출력 함수
    @Override
    public String toString() {
        System.out.println("= 그래프 인접행렬 =");
        StringBuilder sb = new StringBuilder();
        sb.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).getName() + "  ");
        }
        sb.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).getName() + "  ");
            for (int j : adjacencyMatrix[i]) {
                sb.append(j + "  ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
