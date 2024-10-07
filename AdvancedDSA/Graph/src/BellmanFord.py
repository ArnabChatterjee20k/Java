class Solution:
    # Function to construct and return cost of MST for a graph
    # represented using adjacency matrix representation
    '''
    V: nodes in graph
    edges: adjacency list for the graph
    S: Source
    '''
    def bellman_ford(self, V, edges, S):
        dist = [float("inf")] * V
        dist[S] = 0
        
        # relaxation V-1 times
        for _ in range(V - 1):
            for edge in edges:
                src, nei, wt = edge
                if dist[src] != float("inf") and dist[src] + wt < dist[nei]:
                    dist[nei] = dist[src] + wt
        
        # negative weight check in the nth iteration
        for edge in edges:
            src, nei, wt = edge
            if dist[src] != float("inf") and dist[src] + wt < dist[nei]:
                return [-1]  # Indicates a negative weight cycle
        
        return dist
