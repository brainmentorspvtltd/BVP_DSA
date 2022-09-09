import java.util.Arrays;

public class DijkstraAlgo {

    static int[] solution(int graph[][], int v) {
        int distance[] = new int[v];
        Arrays.fill(distance, Integer.MAX_VALUE);
        boolean set[] = new boolean[v];
        distance[0] = 0;

        for(int i = 0; i < v; i++) {
            int source = -1;
            for(int j = 0; j < v; j++) {
                if(!set[j] && (source == -1 || distance[j] < distance[source])) {
                    source = j;
                }
            }
            set[source] = true;
            for(int vertex = 0; vertex < v; vertex++) {
                if(graph[source][vertex] != 0 && set[vertex] == false) {
                    distance[vertex] = Math.min(distance[vertex], graph[source][vertex] + distance[source]);
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int V = 4;
        int graph[][] = {
            {0,5,8,0},
            {5,0,10,15},
            {8,10,0,20},
            {0,15,20,0}
        };
        int res[] = solution(graph, V);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
