package graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph {
    private int[][] matrix;
    private int numVertex;
    private GraphType graphType;

    public AdjacencyMatrixGraph(int numVertex, GraphType graphType) {
        this.numVertex = numVertex;
        this.graphType = graphType;
        this.matrix = new int[numVertex][numVertex];
    }

    @Override
    public void addEdge(int fromVertex, int toVertex) {
        if (!validVertex(fromVertex) || !validVertex(toVertex))
            throw new IllegalArgumentException("Invalid Vertex selected!");

        this.matrix[fromVertex][toVertex] = 1;

        if (graphType == GraphType.UNDIRECTED) {
            this.matrix[toVertex][fromVertex] = 1;
        }

    }

    private boolean validVertex(int vertex) {
        return vertex >= 0 && vertex < numVertex;
    }

    @Override
    public List<Integer> getAdjacencyList(int vertex) {
        if (!validVertex(vertex))
            throw new IllegalArgumentException("Invalid Vertex selected!");
        List<Integer> adjList = new ArrayList<>();

        for (int i = 0; i < numVertex; i++) {
            if (matrix[vertex][i] == 1)
                adjList.add(i);
        }

        return adjList;
    }

    @Override
    public void print() {
        for (int[] row : matrix) {
            for (int vertex : row) {
                System.out.printf("%5d", vertex);
            }
            System.out.println();
        }
    }
}
