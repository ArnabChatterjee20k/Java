def dfs(adj_list,start,end):
        if start == end:
            return 0
        
        step = 1
        min_step = float("inf")
        for nei in adj_list[start]:
            step=dfs(adj_list,nei,end)+1
            min_step = min(min_step,step)
        return min_step

adj_list = {
    0:[1,2],
    1:[2],
    2:[3],
    3:[]
}

print(dfs(adj_list,0,3))
print(dfs(adj_list,3,3))