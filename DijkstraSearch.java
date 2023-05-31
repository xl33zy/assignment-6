import java.util.*;

class DijkstraSearch extends Search {
    public DijkstraSearch(WeightedGraph graph) {
        super(graph);
    }

    public void dijkstra(Vertex source) {
        PriorityQueue<Vertex> queue = new PriorityQueue<>(Comparator.comparingInt(Vertex::getDistance));
        source.setDistance(0);
        queue.offer(source);

        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            System.out.print(vertex.getId() + " ");

            List<Vertex> neighbors = graph.getNeighbors(vertex);
            for (Vertex neighbor : neighbors) {
                int newDistance = vertex.getDistance() + neighbor.getWeight();
                if (newDistance < neighbor.getDistance()) {
                    queue.remove(neighbor);
                    neighbor.setDistance(newDistance);
                    queue.offer(neighbor);
                }
            }
        }
    }
}
