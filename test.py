class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
    
    def __repr__(self) -> str:
        return f"{self.val}"
# Create nodes
node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)

# Connect nodes
node1.neighbors = [node2, node4]
node2.neighbors = [node1, node3]
node3.neighbors = [node2, node4]
node4.neighbors = [node1, node3]

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        self.graph = {}
        graph = self.graph
        seen = set()
        def dfs(node):
            if node in seen:
                return
            
            seen.add(node)
            graph[node] = Node(node.val)
            for nei in node.neighbors:
                graph[node].neighbors.append(Node(nei.val))
                dfs(nei)
        if not node:
            return node
        dfs(node)
        print(graph)
        return graph[node]

    def __repr__(self) -> str:
        for key in self.graph:
            print(self.graph[key].neighbors)
        return ""

# Test the cloneGraph function
solution = Solution()
cloned_graph = solution.cloneGraph(node1)
print(solution)
print(cloned_graph)
