import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // directed graph with unit weight
        int[] v = { 1, 2, 3, 4, 5 };
        int[][] e = {
                { 1, 2 },
                { 1, 3 },
                { 2, 4 },
                { 3, 5 },
                { 4, 5 }
        };
        AdjMatrix graphMatrix = new AdjMatrix(v,e);
        AdjList grAdjList = new AdjList(v, e);

        System.out.println(graphMatrix); // instead of 1 place weight if weight present
        System.out.println(grAdjList); // if not unit weight then store pairs [[node,weight]]
    }
}