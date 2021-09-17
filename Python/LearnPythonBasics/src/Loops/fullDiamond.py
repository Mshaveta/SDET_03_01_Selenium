x = 10;
h = (x + 1) // 2;  # 3

for i in range (1, h + 1):
    for s in range(h - i, 0, -1):
        print("-", end="")
    for st in range(i):
        print("* ", end="") 
    print()
for i in range (1, h):
    for s in range(1, i + 1):
        print("-", end="")
    for st in range(h - i, 0, -1):
        print("* ", end="") 
    print()            
