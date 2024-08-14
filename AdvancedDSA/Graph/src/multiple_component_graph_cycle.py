from cycle import bfs
graph = {
    1: [2, 3],
    2: [1, 4],
    3: [1],
    4: [2],
    5: [6],
    6: [5],
    7: [8, 9],
    8: [7, 9],
    9: [7, 8]
}
v = 9
seen = set()
is_cycle = False
for i in range(1,v+1):
    if i not in seen:
        if(bfs(graph,i,seen)):
            is_cycle = True
            break

print("cycle") if is_cycle else print("not cycle")