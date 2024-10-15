from typing import List
import heapq
class Solution:
    
    #Function to find sum of weights of edges of the Minimum Spanning Tree.
    def spanningTree(self, V: int, adj: List[List[int]]) -> int:
        # we can store parent here as well like pq = [(wt,node,parent)]
        pq = [(0,0)] # taking arbitary node as 0
        vis = set()
        sum = 0
        # E times
        while pq:
		        # log E times
            wt,node = heapq.heappop(pq)
            if node in vis:
                continue
            vis.add(node)
            sum+=wt
            # E logE
            for nei,nei_wt in adj[node]:
                heapq.heappush(pq,(nei_wt,nei))
        
        return sum