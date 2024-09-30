"""
Djikitra will not work for negative weights
It will go on infinite loop as it will go reducing

TC = E logV
"""
from typing import List
import heapq
class Solution:
    """
        why priority queue or min heap and not a simple queue?
        pq helps us to get node which is the min first.
        So basically extra iterations and we are considering length paths due to
        previous addition due to adding of every paths
        Simple bfs is basically traversing every path and brute force way
        PQ is always min first
    """
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

class DjikitraWith_Sets:
    """
        In djikitra we use PQ or sets for maintaining and getting min elements quickly
        But We can't use sets in python or java as it does not store elements in ascending order.
        Sets is beneficial in cases that we can erase element once its done and we dont have to revisit
        Not that much of benficial
        here is a sample code using sets in c++ way
    """
    """
        # insert the starting node in set set({0,S})
        
        while set:
            dis, node = set[0] # need to use method to get 0th element
            set.remove(set[0]) # erasing

            for nei,wt in adj[node]:
                if dis + wt < shortest_dist[nei]:
                    # shortest_dist[nei] != infinity  means 
                    # its visited already and its minimum
                    # we can remove the nei from the set
                    if(shortest_dist[nei] != infinity):
                        set.remove({shortest_dist[nei],nei})
                    
                    shortest_dist[nei] = dis+wt
                    set.add({shortest_dist[nei],nei})
    """
