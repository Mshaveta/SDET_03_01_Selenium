print("Hello, world!")

# Keywords & identifiers
# Identifiers can be a combination of letters in lowercase (a to z) or uppercase (A to Z) or digits (0 to 9) or an underscore _. Names like myClass, var_1 and print_this_to_screen, all are valid example.
# An identifier cannot start with a digit. 1variable is invalid, but variable1 is a valid name.
# Keywords cannot be used as identifiers
a = 1 + 2 + 3 + \
4 + 5 + 6 + 7 + 8 + 9
print(a)

a = (1 + 2 + 3 + 
    4 + 5 + 6 + 
    7 + 8 + 9)

print(a)

colors = ['red', 'blue', 'green']
print(colors)

# We can also put multiple statements in a single line 
# using semicolons, as follows:
a = 1; b = 2; c = 3

# multilne comments:
"""This is also a
perfect example of
multi-line comments"""


def double(num):
    """Function to double the value"""
    return 2 * num


# #Assigning multiple values to multiple variables
a, b, c = 5, 3.2, "Hello"

print (a)
print (b)
print (c)

