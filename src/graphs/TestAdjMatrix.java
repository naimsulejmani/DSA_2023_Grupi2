package graphs;

import queues.QueueOverflowException;
import queues.QueueUnderflowException;

import java.util.List;

public class TestAdjMatrix {
    public static void main(String[] args) throws QueueUnderflowException, QueueOverflowException {
        Graph graph = new AdjacencyMatrixGraph(6, GraphType.UNDIRECTED);
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

        System.out.println("\n DFS: \n");
        int[] visited = new int[6];
        //Graph.dfs(graph, visited, 4);
        Graph.dfs(graph, visited);

        System.out.println("\n BFS: \n");
        visited = new int[6];
        //Graph.bfs(graph, visited, 0);
        Graph.bfs(graph, visited);

    }
}






