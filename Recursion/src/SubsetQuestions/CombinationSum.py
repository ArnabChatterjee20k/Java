candidates = [2,3,7]
ans = []


# here duplicates not eliminated
def sum(cur,total,target):
    if(target == total):
        ans.append(cur.copy()) # creating a copy so that any other elements does not mutate the already added cur

    if(total>target):
         return
    
    for i in candidates:
        cur.append(i)
        sum(cur,total+i,target)
        cur.pop() # when the total>target return executed the last invalid element gets poped


candidates.sort() # sorting the candidates so that we get target less than 0 or equal to 0 at correct time
# here duplicates got eliminated
def sum2(candidates,cur,target):
    if(target==0):
        ans.append(cur.copy()) 
    
    if(target<0):
        return
    
    for i,num in enumerate(candidates):
        cur.append(num)
        # print(candidates[i:])
        sum2(candidates[i:],  # we are removing the first element everytime to remove duplicates
            cur,
            target-num)
        cur.pop()
# sum([],0,7)

sum2(candidates,[],7)
print(ans)