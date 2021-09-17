print("Enter rows number:")
n = int(input())
for i in range(n):
    for j in range(i):
        print(i, end=" ")
    print()

print("============Reverse Pattren==============")  

print("Enter rows number:")
n = int(input())
for i in range(n):
    for j in range(n - i):
        print("*", end=" ")
    print()
    
print("=============Prime Number=============")  
print("Enter number to check ,whether that is prime or not")
num = int(input())
for i in range(2, num // 2):
    if num % i == 0:
        print("Not a  prime number")
        break
else:
        print("Prime Number")    
