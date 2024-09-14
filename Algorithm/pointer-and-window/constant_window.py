k = 4
nums = [-1,2,3,3,4,5,-1]

l = 0
r = k-1
cur_sum = sum(nums[l:r+1])
max_sum_in_win_k = cur_sum
while r<len(nums)-1:
    cur_sum -= nums[l]
    cur_sum += nums[r+1]
    max_sum_in_win_k = max(cur_sum,max_sum_in_win_k)
    l+=1
    r+=1

print(max_sum_in_win_k)