# for ( int x : arr){x}
n = 5
for i in range(n):
    print(i , " - Hello Python!", end=" ")
    
print()  # for Next line
print("===========================================")    
     
n = 5
for i in range(1, n + 1):
    print(i , " - Hello Python!")
    
print()  # for Next line
print("===========================================")  

rCount = input("Enter execution time");  
rCount = int(rCount)
for i in range(1, rCount + 1):
    print(" Hello World!")   

n = int(input("Enter Rows:"));
for i in range(1, n + 1):
   for j in range(i):
       print("*", end="")
   print()  

n = 4;
num = 1;
for i in range(1, n + 1):
    for sp in range(n - i):
        print("-", end="")
         
    for val in range(i):    
        print(num, end=" ")
        num = num + 1;
    print()
       
