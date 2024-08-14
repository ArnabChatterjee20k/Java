import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjList {
    int[] v;
    int[][] e;
    List<Integer>[] graph;

    public AdjList(int[] vertices, int[][] edges) {
        this.v = vertices;
        this.e = edges;
        this.graph = this.construct(vertices, edges);
    }

    private List<Integer>[] construct(int[] vertices, int[][] edges) {
        List<Integer>[] graph = new ArrayList[vertices.length];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int[] edge : this.e) {
            int node1 = edge[0];
            int node2 = edge[1];
            graph[node1].add(node2);
        }
        return graph;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (List<Integer> row : this.graph) {
            str.append(row.toString() + "\n");
        }
        return str.toString();
    }
}
