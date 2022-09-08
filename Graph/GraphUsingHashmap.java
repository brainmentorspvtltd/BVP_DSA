import java.util.HashMap;
import java.util.Map;

class Vertex {
    HashMap<String, Integer> neighbors = new HashMap<>();
}

class GraphOperations {
    HashMap<String, Vertex> vertices = new HashMap<>();
    void addVertex(String vertexName) {
        Vertex vertex = new Vertex();
        vertices.put(vertexName, vertex);
    }

    boolean isEdgeExist(String firstVertex, String secondVertex) {
        Vertex first = vertices.get(firstVertex);
        Vertex second = vertices.get(secondVertex);
        if(first == null || second == null || !first.neighbors.containsKey(secondVertex)) {
            return false;
        }
        return true;
    }

    void addEdge(String firstVertex, String secondVertex, int weight) {
        if(isEdgeExist(firstVertex, secondVertex)) {
            System.out.println("Edge already exists...");
            return;
        }

        Vertex first = vertices.get(firstVertex);
        Vertex second = vertices.get(secondVertex);
        first.neighbors.put(secondVertex, weight);
        second.neighbors.put(firstVertex, weight);
    }

    void print() {
        for(Map.Entry<String, Vertex> currentVertex :  vertices.entrySet()){
            System.out.println(currentVertex.getKey() + " => " + currentVertex.getValue().neighbors);
        }
    }
}

public class GraphUsingHashmap {
    public static void main(String[] args) {
        GraphOperations graph = new GraphOperations();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 10);
        graph.addEdge("B", "C", 20);
        graph.addEdge("C", "D", 40);
        graph.addEdge("A", "D", 12);

        graph.print();
    }
}
