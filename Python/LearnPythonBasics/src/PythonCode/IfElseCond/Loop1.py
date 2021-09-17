# n = int(input("Please enter num of rows:"));
# # 0-n-1
# for i in range(1, n + 1):
#     for j in range(i):
#         print("*", end=" ");
#     print();  
    
n = int(input("Please enter num of rows:"));
# 0-n-1
num = 1;
for i in range(1, n + 1):
    for sp in range(1, n + 1 - i):
        print("-", end="")
    for j in range(i):
        print(num, end=" ");
        num = num + 1;
    print();  
      
