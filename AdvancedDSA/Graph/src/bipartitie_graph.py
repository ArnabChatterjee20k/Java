class Solution:
    def isBipartite(self, graph) -> bool:
        n = len(graph)
        colors = [-1]*n

        def dfs(node, expected_color):
            # colored but the color matches the expected color or not
            # the adjacent colors must be different
            # so expected color and node color must be same
            if colors[node] != -1:
                return colors[node] == expected_color
            colors[node] = expected_color
            # not colored
            for nei in graph[node]:
                if not dfs(nei, self.get_next_color(expected_color)):
                    return False

            return True

        for i in range(n):
            if not dfs(i, 0):
                return False
        return True

    def get_next_color(self, color):
        return abs(1-color)


grid = [[1,3],[0,2],[1,3],[0,2]]
print(Solution().isBipartite(grid))
