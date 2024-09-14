class Solution:
    def minSteps(self, n: int) -> int:
        def get_steps(cur):
            if cur >= n:
                return 1
            step = float("inf")
            step = min(step,get_steps(cur+1))+1
            step = min(step,get_steps(cur))+1
            return step
        return get_steps(1)



Solution().minSteps(3)