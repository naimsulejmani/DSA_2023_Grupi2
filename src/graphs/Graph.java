package graphs;

import java.util.List;

public interface Graph {

    void addEdge(int fromVertex, int toVertex);

    List<Integer> getAdjacencyList(int vertex);

    void print();

    default boolean validVertex(int vertex, int numVertex) {
        return vertex >= 0 && vertex < numVertex;
    }
}
