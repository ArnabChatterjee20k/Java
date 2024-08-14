import java.util.Arrays;

public class AdjMatrix {
    int[] v;
    int[][] e;
    int[][] graph;

    public AdjMatrix(int[] vertices, int[][] edges) {
        this.v = vertices;
        this.e = edges;
        this.graph = this.construct(vertices, edges);
    }

    private int[][] construct(int[] vertices, int[][] edges) {
        int[][] graph = new int[v.length + 1][v.length + 1];
        for (int[] edge : this.e) {
            int node1 = edge[0];
            int node2 = edge[1];

            graph[node1][node2] = 1;
        }

        return graph;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int[] row : this.graph) {
            str.append(Arrays.toString(row) + "\n");
        }
        return str.toString();
    }
}
