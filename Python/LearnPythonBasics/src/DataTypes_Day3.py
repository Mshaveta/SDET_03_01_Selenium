 ##DataTypes:###
# 1. None--- Have variable and not asigend any value is called none,
# as in Java its Null value
# 2. Numeric--->int,float,complex and bool
# 2. Sequence--->Set, Tuple,
# 3. Dictionary / Map
# 4. Bool
# 5. No character type value in python

# Type 2: Numeric
num = 2.5
print(type(num))

num = 2
print(type(num))

# complex number
img = 2 + 9j
print(type(img))

boolvar = True
print(type(boolvar))

# TypeCasting inPython
floatNum = 6.7
numb = int(floatNum)  # convert float into Int (int)x
print(type(numb))

strVal = 'A'; 
print(type(strVal))

# TypeCasting in complex number Python
real = 6
imgNum = 5
numb = complex(real, imgNum)  # convert in to complex
print(type(numb))
print(numb)

# TypeCasting in boolean to int in Python
boolvar = True
numbool = int(boolvar)
print(numbool)
print(type(numbool))

numZero = 0
numTrue = bool(numZero)
print(numTrue)
print("Type Casting in boolean---", type(numTrue))

a = 90
b = 89
print(type(a > b))

# convert into string
x = str("s1")  # x will be 's1'
y = str(2)  # y will be '2'
z = str(3.0)  # z will be '3.0'

