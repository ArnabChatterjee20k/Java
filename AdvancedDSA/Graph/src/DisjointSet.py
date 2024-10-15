class DisjointSet:
    def __init__(self, n):
        self.rank = [0]*(n+1)
        self.parent = [i for i in range(n+1)]
        self.size = [1]*(n+1) # default size will be 1 for every node
    
    def find_ultimate_parent(self, node):
        # what is wrong here
        if node == self.parent[node]:
            return node
        self.parent[node] = self.find_ultimate_parent(self.parent[node])
        return self.parent[node]

    def union_by_rank(self, u, v):
        # due to path compression, the rank of the ultimate parent gets increased and thats why we dont get the actual size of the nodes
        ultimate_parent_u = self.find_ultimate_parent(u)
        ultimate_parent_v = self.find_ultimate_parent(v)
        # in case parent are same
        if ultimate_parent_u == ultimate_parent_v:
            return
        
        # chaning parent
        if self.rank[ultimate_parent_u] < self.rank[ultimate_parent_v]:
            # attaching u to v
            self.parent[ultimate_parent_u] = ultimate_parent_v
        elif self.rank[ultimate_parent_v] > self.rank[ultimate_parent_u]:
            # attaching v to u
            self.parent[ultimate_parent_v] = ultimate_parent_u
        
        else:
            # if the rank are same we can attach any to any
            # attaching v to u
            self.parent[ultimate_parent_v] = ultimate_parent_u
            self.rank[ultimate_parent_u]+=1

    def union_by_size(self,u,v):
        ultimate_parent_u = self.find_ultimate_parent(u)
        ultimate_parent_v = self.find_ultimate_parent(v)

        if ultimate_parent_u == ultimate_parent_v:
            return
        
        if self.size[ultimate_parent_u] < self.size[ultimate_parent_v]:
            self.parent[ultimate_parent_u] = ultimate_parent_v
            self.size[ultimate_parent_v]+=self.size[ultimate_parent_u]

        elif self.size[ultimate_parent_v] < self.size[ultimate_parent_u]:
            self.parent[ultimate_parent_v] = ultimate_parent_u
            self.size[ultimate_parent_u]+=self.size[ultimate_parent_v]
        else:
            self.parent[ultimate_parent_v] = ultimate_parent_u
            self.size[ultimate_parent_u]+=self.size[ultimate_parent_v]

ds = DisjointSet(7)
ds.union_by_size(1,2)
ds.union_by_size(2,3)
print(ds.size)
print(ds.parent)
ds.union_by_size(4,5)
ds.union_by_size(6,7)
ds.union_by_size(3,7)
if ds.find_ultimate_parent(3) == ds.find_ultimate_parent(7):
    print("same component")
else:
    print("not same component")