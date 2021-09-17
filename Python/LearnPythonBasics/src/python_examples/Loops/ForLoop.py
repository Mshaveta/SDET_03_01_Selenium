i = 1
for x in range(1, 11):
    if x % 2 == 0:
        print("yes")
    else:
        print("NO")  
        
nums = [13, 45, 56, 567, 44]
for x in nums:  
    if x % 2 == 0:
        print("yes")
        break        
    print(x, end="-")
