class Solution:
    def minimumSteps(self, s: str) -> int:
        l = 0
        r = 1
        chars = s.split()
        ans = 0
        while l<len(chars) and r<len(chars):
            if chars[r] == "1":
                r+=1
            if chars[l] == "0":
                l+=1
            
            if chars[l] == "1" and chars[r] == "0":
                chars[l],chars[r] = chars[r], chars[l]
                ans+=(r-l)
        return ans
Solution().minimumSteps("1010101")