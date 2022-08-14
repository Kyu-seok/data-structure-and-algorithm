package bfs_dfs_adjacency_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<GraphNode> nodeList;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbour.add(second);
        second.neighbour.add(first);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.get(i).neighbour.size(); j++) {
                if (j == nodeList.get(i).neighbour.size() - 1) {
                    s.append((nodeList.get(i).neighbour.get(j).name));
                } else {
                    s.append((nodeList.get(i).neighbour.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    // BFS internal
    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor : currentNode.neighbour) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

}
