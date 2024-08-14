from collections import deque

def bfs(graph, start,seen):
    """
        1. It starts at node 1 and explores its neighbors (2 and 3).
        2. It then explores the neighbors of 2 and 3.
        3. When it reaches node 7 from node 5, it marks 7 as visited.
        4. Later, when it tries to visit 7 from node 6, it finds that 7 is already visited.
        5 .Since 7 is visited and it's not the parent of the current node (6), a cycle is detected.
    """
    q = deque([(start, -1)])  # node, parent
    seen.add(start)
    while q:
        node, parent = q.popleft()
        for nei in graph[node]:
            if nei not in seen:
                q.append((nei, node))
                seen.add(nei)
            elif nei != parent:
                return True
    return False
def dfs(graph, node, parent, seen):
    # not required as we are using adj list
    # if not node:
    #     return False
    seen.add(node)
    
    for nei in graph[node]:
        if nei not in seen:
            if dfs(graph, nei, node, seen):
                return True
        elif nei != parent:
            return True
    
    return False

graph = {
    1: [2, 3],
    2: [1, 5],
    3: [1, 4, 6],
    4: [3],
    5: [2, 7],
    6: [3, 7],
    7: [5, 6]
}

non_cyclic_graph = {
    0: [1, 2],
    1: [0, 3],
    2: [0, 4],
    3: [1],
    4: [2]
}


start = 1
print(bfs(graph, start,set()))
print(dfs(graph,start,-1,set()))

print(bfs(non_cyclic_graph, start,set()))
print(dfs(non_cyclic_graph,start,-1,set()))