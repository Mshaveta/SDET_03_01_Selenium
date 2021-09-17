a = input("Enter number a")
a = int(a)  # 100
b = 200
    
if b > a :
    print("b is greater than a")
print("end if")
  
a = 100
b = 33
if b > a:
  print("b is greater than a")
else:
  print("b is not greater than a")
  
# The elif keyword is pythons way of saying "if the previous conditions were not true, then try this condition".
a = 11
b = 33
if b > a:
  print("b is greater than a")
elif a == b:
  print("a and b are equal")
  
# The else keyword catches anything which isn't caught by the preceding conditions.
a = 200
b = 33
if b > a:
    print("b is greater than a")
elif a == b:
  print("a and b are equal")
else:
  print("a is greater than b")
  
# Short Hand If
  if a > b: print("a is greater than b")
 
# The and keyword is a logical operator, and is used to combine conditional statements:
a = 100
b = 30
c = 190
if a > b and c > a:
    print("Both conditions are True");  # depends onabove cond
    print("next statement")
  
# The or keyword is a logical operator, and is used to combine conditional statements:
if a > b or a > c:
    print("At least one of the conditions is True")
