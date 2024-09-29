"""
Djikitra will not work for negative weights
It will go on infinite loop as it will go reducing

TC = E logV
"""
from typing import List
import heapq
class Solution:
    #from the source vertex S.
    def dijkstra(self, V: int, adj: List[List[int]], S: int) -> List[int]:
        shortest_dist = [float("inf")]*V
        
        # min heap => [(wt,node)]
        pq = [(0,S)] # starting node is having 0 from its own
        
        shortest_dist[S] = 0
        
        while pq:
            dis, node = heapq.heappop(pq)
            
            for nei,wt in adj[node]:
                if dis + wt < shortest_dist[nei]:
                    shortest_dist[nei] = dis+wt
                    heapq.heappush(pq, (shortest_dist[nei], nei))
        
        
        return shortest_dist
