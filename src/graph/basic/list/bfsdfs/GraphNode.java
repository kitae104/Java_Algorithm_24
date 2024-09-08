package graph.basic.list.bfsdfs;

import lombok.Data;

import java.util.ArrayList;

@Data
public class GraphNode {
    private String name;
    private int index;
    private boolean visited;

    private ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.visited = false;
    }
}
