# adj_list
graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

from collections import deque
start = "A"
q = deque([start])
seen = set()
seen.add(start)
while q:
    node = q.popleft()
    print(node)
    for nei in graph[node]:
        if nei not in seen:
            seen.add(nei)
            q.append(nei)


"""
    SC -> q + seen => O(2N) = O(N) [if we append result to a list then 3N]
    TC -> 
    Node goes once to the q =>
    means the nei traversal run on all its neis =>
    means the traversal run on all of its degrees =>
    degree = 2Edges

    TC = O(N) + O(2E)
    O(N) for q traversal
        
"""