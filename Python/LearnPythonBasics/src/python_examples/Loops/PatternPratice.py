n = int(input("Enter num of rows"))
for i in range (n + 1):
    for j in range (i):
        print("*", end="")
    print()
