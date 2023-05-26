package graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph implements Graph {
    private List<Integer>[] adjacencyList;
    private int numVertex;
    private GraphType graphType;

    public AdjacencyListGraph(int numVertex, GraphType graphType) {
        this.numVertex = numVertex;
        this.graphType = graphType;
        this.adjacencyList = new List[numVertex];

        for (int i = 0; i < numVertex; i++) {
            this.adjacencyList[i] = new ArrayList<>();
        }
    }

    @Override
    public void addEdge(int fromVertex, int toVertex) {
        if (!validVertex(fromVertex, numVertex) || !validVertex(toVertex, numVertex)) {
            throw new IllegalArgumentException("Invalid Vertex selected!");
        }

        this.adjacencyList[fromVertex].add(toVertex);

        if (graphType == GraphType.UNDIRECTED) {
            this.adjacencyList[toVertex].add(fromVertex);
        }
    }

    @Override
    public List<Integer> getAdjacencyList(int vertex) {
        if (!validVertex(vertex, numVertex))
            throw new IllegalArgumentException("Invalid Vertex selected!");
        ArrayList<Integer> list = (ArrayList<Integer>) this.adjacencyList[vertex];
        return (List<Integer>) list.clone();
    }

    @Override
    public void print() {
        int startVertex = 0;
        for (List<Integer> vertexList : adjacencyList) {
            System.out.printf("[%d] -> ", startVertex++);
            for (int vertex : vertexList) {
                System.out.printf("%5d", vertex);
            }
            System.out.println();
        }
    }
}






