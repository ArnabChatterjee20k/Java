class Solution:
    def shortest_distance(self, matrix):
        n = len(matrix)

        # Replace -1 with infinity, except diagonal elements
        for i in range(n):
            for j in range(n):
                if matrix[i][j] == -1:
                    matrix[i][j] = float("inf")
                if i == j:
                    matrix[i][j] = 0
        
        # Floyd-Warshall algorithm to find the shortest path
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    matrix[i][j] = min(matrix[i][j], matrix[i][k] + matrix[k][j])
        
        # Check for a negative cycle
        for i in range(n):
            if matrix[i][i] < 0:
                print("Negative cycle exists")

        # Replace infinity back with -1 for unreachable paths
        for i in range(n):
            for j in range(n):
                if matrix[i][j] == float("inf"):
                    matrix[i][j] = -1
