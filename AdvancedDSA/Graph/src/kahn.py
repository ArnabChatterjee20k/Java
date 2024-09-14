import collections
# in dag , 4:[0,1] means 4 is incoming edge to 0 and 1. 0,1 has incoming edge 4
dag = {
    0: [],
    1: [],
    2: [3],
    3: [1],
    4: [0, 1],
    5: [0, 2]
}

# we can make it default dict as well
in_degree = [0]*len(dag)
for v, nei in dag.items():
    for node in nei:
        in_degree[node] += 1

"""
 dont sort the in_degree otherwise the the index will get misplaced
 if index 5 is having 0 then it will get at index 1.
 so it will become node 1 instead of 5
"""


q = collections.deque()
topo = collections.deque()

for node, degree in enumerate(in_degree):
    if degree == 0:
        q.append(node)

def kahn_topo_sort_bfs():
    while q:
        node = q.popleft()
        # just append to topo here only as if its in queue that means the indegree is 0
        topo.append(node)
        nei = dag[node]
        for n in nei:
            in_degree[n] -= 1
            if in_degree[n] == 0:
                q.append(n)

kahn_topo_sort_bfs()
while topo:
    print(topo.popleft(),end=" ")
