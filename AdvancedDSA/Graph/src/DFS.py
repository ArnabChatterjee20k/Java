graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

seen = set()
start = "A"
seen.add(start)
def dfs(node):
    seen.add(node)
    print(node)
    for nei in graph[node]:
        if nei not in seen:
            dfs(nei)

dfs(start)

"""
SC -> seen + recursion stack space = O(2N) => O(N)
TC ->
"""