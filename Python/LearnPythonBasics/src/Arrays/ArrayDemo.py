# Arrays store the similar DataType values
# IN Python, we can expand and shrink the size of an array
# can create an array using array() and need to use import 

# signed int means  from -ve to +ve values-----i (allow -ve values)
# unsigned means only positive values---------I (doesn't allow -ve values)
# for charcters use-  u

# 1 way:
# import array as arr
# arr.array()

# 2. way:
from array import *

# Syntax : array('type of data want to store', [arrayvalues])
vals = array('i', [12, 34, -45, 456, 67])

# To get the size of an array:
count = vals.buffer_info()
print("Total Array elements-", count);  # returns memory address, total count of an element

# To check the Type code
print(vals.typecode)  # i->integer

# To append the values in an array
vals.append(300)
print("Appended Values", vals)

# To reverse the array
vals.reverse()
print(vals)

print(vals[2])

# 1way: - To print arrays elements
for i in vals:
    print(i, end=" ")
    
# 2way: - To print arrays elements
for i in range(len(vals)):
    print(i, end=" ")
  
 # For storing characters   
chars = array('u', ['a', 'e', 'i', 'o', 'u'])
for x in chars:
    print(x)
    
# to Copy an array from older one--if we dn't know the type code and values of any array,
# it will pick the values one by one and store it into an array
newCharsArr = array(chars.typecode, (nvals for nvals in chars))

for newOnes in newCharsArr:
    print("New Copied Array", newOnes)

