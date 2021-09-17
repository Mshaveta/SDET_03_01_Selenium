n = int(input("Enter row count"));
half = (n + 1) // 2;  # 3
star = 0;

for i in range(1, n + 1):
    if i <= half:  # 1<=3,2<=3, 3<=3,  4<=3
        star = (2 * i) - 1;  # 2*1-1=1,2*2-1=3
    else:
        star = star - 2;  # 5-->3 
        
    for j in range(1, star + 1):  # (1,2)
        print("*", end="")
        
    print()    

