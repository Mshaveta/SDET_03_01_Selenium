num = int(input())
for i in range(1, num + 1):
    for sp in range(1, num + 1 - i):
        print("-", end="")
    for st in range(1, i + 1):
        print("* ", end="")
    print()       
    
