import java.util.*;

class BreadthFirstSearch extends Search {
    public BreadthFirstSearch(WeightedGraph graph) {
        super(graph);
    }

    public void bfs(Vertex source) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(source);
        source.setVisited(true);

        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            System.out.print(vertex.getId() + " ");

            List<Vertex> neighbors = graph.getNeighbors(vertex);
            for (Vertex neighbor : neighbors) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }
}