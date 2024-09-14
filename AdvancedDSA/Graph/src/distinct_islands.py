from typing import List


class Solution:
    def countDistinctIslands(self, grid: List[List[int]]) -> int:
        DIR = ((0, 1), (1, 0), (-1, 0), (0, -1))
        ROW = len(grid)
        COL = len(grid[0])
        visited = set()
        islands = set()

        def dfs(r, c, start_r, start_c, cur_islands):
            if (r, c) in visited:
                return

            visited.add((r, c))
            cur_islands.append((start_r-r, start_c-c))

            for dr, dc in DIR:
                new_r = r+dr
                new_c = c+dc

                if new_r >= 0 and new_c >= 0 and new_r < ROW and new_c < COL and grid[new_r][new_c] == 1:
                    dfs(new_r, new_c, start_r, start_c, cur_islands)

        for r in range(ROW):
            for c in range(COL):
                if (r, c) not in visited and grid[r][c] == 1:
                    cur_islands = []
                    dfs(r, c, r, c, cur_islands)
                    islands.add(tuple(cur_islands))

        return len(islands)


grid = [[1, 1, 0, 0, 0],
        [1, 1, 0, 0, 0],
        [0, 0, 0, 1, 1],
        [0, 0, 0, 1, 1]]

print(Solution().countDistinctIslands(grid))
