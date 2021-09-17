x = 13
flag = False;
for i in range(2, x):
    if x % i == 0:
        flag = True
        break;
if flag:
    print('not prime')
else:
    print('prime')    
    
