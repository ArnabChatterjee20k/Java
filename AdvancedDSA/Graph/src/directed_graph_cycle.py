def cycle():
    adj_list = {
        1: [2],
        2: [3],
        3: [4, 7],
        4: [5],
        5: [6],
        6: [],
        7: [5],
        8: [9],
        9: [10],
        10: [8]
    }
    nodes = len(adj_list)
    visited = [0]*(nodes+1)
    path_visited = [0]*(nodes+1)
    def dfs(node):
        visited[node] = 1
        path_visited[node] = 1
        for nei in adj_list[node]:
            if not visited[nei]:
                if dfs(nei):
                    return True
            # already visited
            # and the path is also same
            # means the nei is in the path or not
            if path_visited[nei]:
                return True
        
        path_visited[node] = 0


    for i in range(1,nodes+1):
        if not visited[i]:
            if dfs(i):
                return True

    return False

print(cycle())