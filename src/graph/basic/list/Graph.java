package graph.basic.list;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Graph {

    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>(); // 그래프 노드 리스트

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    // 무방향 그래프 간선 추가
    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);  // i번째 노드
        GraphNode second = nodeList.get(j); // j번째 노드
        first.getNeighbors().add(second);   // i번째 노드의 이웃에 j번째 노드 추가
        second.getNeighbors().add(first);   // j번째 노드의 이웃에 i번째 노드 추가
    }

    // 그래프 출력 함수
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (GraphNode graphNode : nodeList) {
            sb.append(graphNode.getName()).append("의 인접리스트 : ");
            for (int j = 0; j < graphNode.getNeighbors().size(); j++) {
                if (j == graphNode.getNeighbors().size() - 1) {
                    sb.append(graphNode.getNeighbors().get(j).getName());   // 마지막 원소인 경우
                } else {
                    sb.append(graphNode.getNeighbors().get(j).getName()).append(" -> ");    // 계속 이어지는 경우
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
