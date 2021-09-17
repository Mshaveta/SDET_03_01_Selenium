n = 134;
flag = False;
for i in range(2, n // 2):
    if n % i == 0:
        flag = True
        break;

if (flag is True):
    print("not a prime number");
else:
    print("prime number")  
    
# if flag:
#     print("not a prime number");
# else:
#     print("prime number")            
#         
# x = 100
# y = 100
# if (x is y):
#     print("Same")        
