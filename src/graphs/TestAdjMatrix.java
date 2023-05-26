package graphs;

import java.util.List;

public class TestAdjMatrix {
    public static void main(String[] args) {
        Graph graph = new AdjacencyMatrixGraph(5, GraphType.UNDIRECTED);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.print();

        List<Integer> adjacencyList = graph.getAdjacencyList(1);
        System.out.print("\n\n 1 -> ");
        for (int vertex : adjacencyList) {
            System.out.printf("%5d", vertex);
        }
        System.out.println();
    }
}






