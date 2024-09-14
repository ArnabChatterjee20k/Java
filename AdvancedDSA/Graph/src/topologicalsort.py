dag = {
    0: [],
    1: [],
    2: [3],
    3: [1],
    4: [0, 1],
    5: [0, 2]
}

vis = set()
stack = []

def dfs(node):
    vis.add(node)
    for nei in dag[node]:
        if not nei in vis:
            dfs(nei)

    stack.append(node)

for i in dag:
    if not i in vis:
        dfs(i)

while stack:
    print(stack.pop(),end=" ")