# Tuple is a collection which is ordered(L) and unchangeable(S). 
# Allows duplicate members(L).
# Tuples are unchangeable, so you cannot remove items from it,
# but you can delete the tuple completely
# The del keyword can't removes the specified index, can delete whole tuple

#===============================================================================
# {}--Set
# []--List
# ()--tuple
#===============================================================================

techs = ("JAVA", "PHP", "jQuery")
print(techs)

# Access the item
tech = ("JAVA", "PHP", "jQuery")
print("value-", tech[1])

# can't Change element Value
# thislist = ("JAVA", "PHP", "jQuery")
# thislist[1] = "SQL"
# print(thislist)
    
# Loop Through a List
thislist = ("JAVA", "PHP", "jQuery")
for x in thislist: 
    print(x)
    
# Check if Item Exists
thislist = ("JAVA", "PHP", "jQuery")
if "JAVA" in thislist:
    print("Yes, 'JAVA' is in the tech list")
  
# To determine how many items a list has, use the len() method:
thislist = ("JAVA", "PHP", "jQuery")
print(len(thislist))
 
# It is also possible to use the tuple() constructor to make a tuple.
thistuple = tuple(("JAVA", "PHP", "jQuery"))   
print(thistuple)

# Search for the first occurrence of the value 8, and return its position:
thistuple = (1, 3, 7, 8, 17, 5, 4, 6, 18, 25)
# del thistuple[2];#can't remove the elmn using del with index
# print("after deleting tuple-", thistuple)

x = thistuple.index(8)
print("searched value- ", x)
 
# pop
a = list(thistuple);
print("New List ", a)
del a[2];
print("After deletion- ", a)
 
a.pop(0);
print(a)
print(type(a))

##################to make chnages
thisNewlist = ("JAVA", "PHP", "jQuery")
thisNewlist = list(thisNewlist)
thisNewlist.append("SDET")
print(type(thisNewlist), thisNewlist);
