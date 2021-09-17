PI = 3.14
GRAVITY = 9.8

print(PI)
print(GRAVITY)

# Literals
# Literal is a raw data given in a variable or constant. 
# In Python, there are various types of literals they are as follows:
# Numeric Literals
# Numeric Literals are immutable (unchangeable). 
# Numeric literals can belong to 3 different numerical types: Integer, Float, and Complex.
a = 0b1010  # Binary Literals
b = 100  # Decimal Literal 
c = 0o310  # Octal Literal
d = 0x12c  # Hexadecimal Literal

# Float Literal
float_1 = 10.5 
float_2 = 1.5e2

# Complex Literal 
x = 3.14j

print(a, b, c, d)
print(float_1, float_2)
print(x, x.imag, x.real)

x = (1 == True)
y = (1 == False)
a = True + 4
b = False + 10

print("x is", x)
print("y is", y)
print("a:", a)
print("b:", b)

###########################################
fruits = ["apple", "mango", "orange"]  # list
numbers = (1, 2, 3)  # tuple
alphabets = {'a':'apple', 'b':'ball', 'c':'cat'}  # dictionary
vowels = {'a', 'e', 'i' , 'o', 'u'}  # set

print(fruits)
print(numbers)
print(alphabets)
print(vowels)
