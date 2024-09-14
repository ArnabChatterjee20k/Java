arr = [2,5,1,7,10]
k = 14

def brute_force():
    # TC -> O(N^2)
    all_subarray = []
    ans = -1
    for i in range(len(arr)):
        cur_set = []
        cur_sum = 0
        for j in range(i,len(arr)):
            cur_set.append(arr[j])
            # we can do sum(cur_set) but we dont need to get sum
            cur_sum+=arr[j]
            if cur_sum<=k:
                all_subarray.append(cur_set.copy())
                ans = max(len(cur_set),ans)
    
    return all_subarray,ans

def better():
    # start with window size of 1
    # TC -> O(N+N)
    l = 0 
    r = 0
    max_len = 0
    sum = 0
    ans = []
    while r<len(arr):
        sum+=arr[r]
        while sum>k:
            sum-=arr[l]
            l+=1
        if sum<=k:
            max_len = max(r-l+1,max_len)
            ans.append(arr[l:r+1])
        r+=1
    return ans,max_len

def optimal():
    # shrinking is causing the another N
    # we can optimise that
    # we will not shrink below a length
    # cant use this if we need to generate subarrays as well
    # TC -> O(N)
    l = 0 
    r = 0
    max_len = 0
    sum = 0
    ans = []
    while r<len(arr):
        sum+=arr[r]
        # now we dont check all
        if sum>k:
            sum-=arr[l]
            l+=1
        if sum<=k:
            max_len = max(r-l+1,max_len)
            ans.append(arr[l:r+1])
        r+=1
    return max_len

print(brute_force())
print(better()) # for every possible subarray we need to add through brute force
print(optimal())