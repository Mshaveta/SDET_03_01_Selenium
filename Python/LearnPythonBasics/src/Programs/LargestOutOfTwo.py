a = 150
b = 145
c = 167
if a > b:
    print("a is greater")
else:
    print("b is greater")    

if a > b:
    if a > c:
        print("a is greater")
    else:
        print("c is greater")
elif b > a:
    if b > c:
        print("b is greater")            
    else:
        print("c is greater")  
else:
    print("c is greater")          
