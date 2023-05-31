public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(5);
        Vertex vertex0 = new Vertex(0);
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);

        graph.addEdge(vertex0, vertex1, 2);
        graph.addEdge(vertex0, vertex2, 6);
        graph.addEdge(vertex1, vertex3, 5);
        graph.addEdge(vertex2, vertex3, 12);
        graph.addEdge(vertex2, vertex4, 8);
        graph.addEdge(vertex3, vertex4, 10);

        BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
        DijkstraSearch dijkstra = new DijkstraSearch(graph);

        System.out.println("BFS traversal:");
        bfs.bfs(vertex0);

        System.out.println("\nDijkstra's Algorithm:");
        dijkstra.dijkstra(vertex4);
    }
}
