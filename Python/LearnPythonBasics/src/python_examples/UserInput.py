# input() method is used to get the value from the use and
# it always gives the input in string format

x = input("Enter first number")  
print(type(x))

x = int(x)  # To check the type of x
y = input("Enter second number")
y = int(y)
z = x + y
print(z)

############To user input in char format ###########
ch = input("Enter character")
print(ch)  # # it will print more than one chrs.

############TYo print single character################
ch = input("Enter character")
print(ch[0])

###############can write code like this ############
ch = input("Enter character")[1]
print(ch)

#####################To evaluate the expression which are passing  #################
result = eval(input("Enter the Expression"))  # 4+5*6
print(result);

