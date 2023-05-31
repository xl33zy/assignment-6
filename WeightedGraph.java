import java.util.*;

class WeightedGraph {
    private final List<List<Vertex>> adjacencyList;

    public WeightedGraph(int numberOfVertices) {
        this.adjacencyList = new ArrayList<>(numberOfVertices);

        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {
        adjacencyList.get(source.getId()).add(destination);
        adjacencyList.get(destination.getId()).add(source);
    }

    public List<Vertex> getNeighbors(Vertex vertex) {
        return adjacencyList.get(vertex.getId());
    }
}