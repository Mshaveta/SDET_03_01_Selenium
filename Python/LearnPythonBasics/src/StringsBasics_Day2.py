# Get the character at position
a = "Hello"
print(a[1])  # e
#

# Substring. Get the characters from position 2 to position 5 (not included):
b = "Python"
print(b[2:5])  # startIndex : endINdex-1
# str.substr(2,5)

# The strip() method removes any whitespace from the beginning or the end:
a = "  Let's learn Python       "
print(a.strip())
# JAVA- trim()

# The len() method returns the length of a string:
a = "Python"
print(len(a))  # function
# JAVA -  a.length()

# The upper() method returns the string in upper case:
a = "python"
print(a.upper())
# JAVA - a.toUpperCase()

# The replace() method replaces a string with another string:
a = "Python"
print(a.replace("P", "z"))
# JAVA - str.replace("old char", 'new char');

# The split() method splits the string into substrings 
# if it finds instances of the separator:
a = "id###email"
str = a.split("###")
print(str[0] + " " + str[1])
# #jAVA - 

# # Command-line String Input
# print("Enter your first name:")
# x = input()
# print("Hello, " , x)

strx = "\"Ram\" computer";
val = strx * 3;
print(val)
 
a = "11\n"
b = 21
c = 31
d = 100
print(type(a))
print(b)
print(c)
print(d, b, c, sep="@")
 
