from collections import defaultdict , deque

graph_no_eulerian_path = {
    0: [1, 2],    # Out-degree 2, In-degree 0
    1: [2],       # Out-degree 1, In-degree 1
    2: [3],       # Out-degree 1, In-degree 2
    3: [0, 4],    # Out-degree 2, In-degree 1
    4: [1]        # Out-degree 1, In-degree 1
}

graph_euler_path = {
    0: [1, 6],
    1: [2],
    2: [0, 3],
    3: [4],
    4: [2, 5],
    5: [0],
    6: [4],
}


def get_start_node(vertices, in_deg, out_deg):
    start = -1
    for v in vertices:
        if out_deg[v] - in_deg[v] == 1:
            return v

        if out_deg[v]>0:
            start = v
            break
    return start


def find_path_dfs(g,node,ans):
    # **Follow edges** until you reach a vertex that has no more unused outgoing edges.
    while g[node]:
        cur = g[node].pop()
        find_path_dfs(g,cur,ans)
        ans.append([node,cur])

def has_eulerian_path(graph):
    in_degree = defaultdict(int)
    out_degree = defaultdict(int)
    vertices = set(graph.keys())

    for u in graph:
        for v in graph[u]:
            in_degree[v] += 1
            out_degree[u] += 1
            vertices.add(v)

    start_nodes = 0
    end_nodes = 0

    for v in vertices:
        extra_outgoing = out_degree[v] - in_degree[v]
        extra_incoming = in_degree[v] - out_degree[v]

        if extra_outgoing > 1 or extra_incoming > 1:
            return False

        if extra_outgoing == 1:
            start_nodes += 1

        elif extra_incoming == 1:
            end_nodes += 1

    is_eulerian = (start_nodes == 0 and end_nodes == 0) or (
        start_nodes == 1 and end_nodes == 1)
    
    ans = []
    if is_eulerian:
        start = get_start_node(vertices,in_degree,out_degree)
        path = find_path_dfs(graph,start,ans)
        return is_eulerian,path,ans
    return is_eulerian,None,ans


print("\nHas Eulerian Path:", has_eulerian_path(graph_no_eulerian_path))
print("\nHas Eulerian Path:", has_eulerian_path(graph_euler_path))
