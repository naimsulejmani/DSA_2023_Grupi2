package graphs;

import queues.Queue;
import queues.QueueOverflowException;
import queues.QueueUnderflowException;

import java.util.List;

public interface Graph {

    void addEdge(int fromVertex, int toVertex);

    List<Integer> getAdjacencyList(int vertex);

    void print();

    default boolean validVertex(int vertex, int numVertex) {
        return vertex >= 0 && vertex < numVertex;
    }

    public static void dfs(Graph graph, int[] visited, int currentVertex) {
        if (visited[currentVertex] == 1) return;
        visited[currentVertex] = 1;
        System.out.print(currentVertex + " -> ");
        List<Integer> adjacencyList = graph.getAdjacencyList(currentVertex);

        for (int vertex : adjacencyList) {
            dfs(graph, visited, vertex);
        }
    }

    public static void dfs(Graph graph, int[] visited) {
        for (int vertex = 0; vertex < visited.length; vertex++) {
            dfs(graph, visited, vertex);
        }
    }

    public static void bfs(Graph graph, int[] visited, int currentVertex)
            throws QueueOverflowException, QueueUnderflowException {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(currentVertex);
        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();
            if (visited[vertex] == 1) continue;
            visited[vertex] = 1;
            System.out.print(vertex + " -> ");
            List<Integer> adjacencyList = graph.getAdjacencyList(vertex);
            for (int v : adjacencyList) {
                if (visited[v] != 1)
                    queue.enqueue(v);
            }
        }
    }

    public static void bfs(Graph graph, int[] visited)
            throws QueueUnderflowException, QueueOverflowException {
        for (int vertex = 0; vertex < visited.length; vertex++) {
            bfs(graph, visited, vertex);
        }
    }
}










