import java.util.ArrayList;
import java.util.LinkedList;

public class ShortestPathUnweighted {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    static void bfs(ArrayList<ArrayList<Integer>> adj, boolean visited[], int dist[], int source) {
        // Initialize a queue and push source in it
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while(queue.size() != 0) {
            // Pop front element of queue
            source = queue.poll();
            for(int v : adj.get(source)) {
                if(visited[v] == false) {
                    dist[v] = dist[source] + 1;
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for(int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);

        bfs(adj, V);
    }
}
