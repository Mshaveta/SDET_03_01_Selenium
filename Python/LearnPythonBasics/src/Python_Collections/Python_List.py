# List is a collection which is ordered and changable. 
# Allows duplicate members.
# []

# duplicate elements
# hetrogenous
# changeable--->x[2]=100
# indexed---->
# ordered--->

# Methods:
# len(),-----
# append(),
# remove("itemName"),
# pop()--removes last elm,
# pop(index),

# del list[index],
# clear()--empty the list
# to copy the list -- list(list_name),list.copy(),
# sort()--sorting
# insert(index,"val")

###########################
a = [1, 2, 3, 4, 5, 6, 7, 8]
print(a[0])
print(a[-1])  # - represents reverse order
print(a[:])  # access complete List
  
print(a[2: ])
  
print("reverse list - ", a[-4:])  #  
  
print("Values with end index rev. order-", a[:-5])  #### start index= 0, end = -5
print("values are:- ", a[0:4])
print(a[2:7])  # 2,3,4,5,6
 
# ################ Nested List ######################
newList = [10, 20, [23, 45, 56]]
print(newList)
print(newList[2][0])  # 23
print(newList[2][1])  # 45
print(newList[2][2])  # 56
# 
# #####################################
newList = [10, 20, 30, 40, 56, 78, 89, 56, 45]
newList[0] = 40
print("Change the value of existing Element-", newList)
# # # ############################################
newList.insert(2, "Testing")
print("Insert new Elem -", newList)
# # # ##################################
newList.append("API")
print("Append new elm-", newList)
 
# # ######################################
newList = [10, 20, 30, 40, 56, 78, 89, 56, 45]
newList.pop(0) 
print("pop element placed at index 0", newList)
print(newList)
    
newList.pop() 
print("remove last elment- ", newList)
#  
# ######################################
newList.remove(89)
print("Remove Elmeent - ", newList)
 
# ##############################
del newList[0:2]
print("After Deleting....", newList)
  
newList = [10, 56, 45, 56, 56, 56]   
countVal = newList.count(56);
print("Count value of 56- ", countVal)
#  
# ######################################
 
# # List
x = [0, 1, 2, 2, 2]
print (x);
print("==================")
   
x[1] = 8
print (x);
  
print("==================")
x = [0, 1, [2, 1, 2, 3, 4], 5]  # index-2 - [0->2]
x.append(5)
x[2][4] = 3

print("full List-", x)
   
x[2].append(10);
  
print ("Append value in inner list-", x);
print("==================")
x[2].append(4)
print (x);
print("==================")
  
x[2] = 2
print (x);
print("==================")

# # Access the item
tech = ["JAVA", "PHP", "jQuery"]
print(tech[1])
print("==================")
# Negative indices can be used to index the list from right.
 #          (1) (2) (3)(4) 5       
vals = [12, 34, 56, 7, 8, 9, 23, 44] 
 #                    -4  -3  -2  -1
# 0-7
# rev-  -1 - -8
print(vals)
print(vals[1:4])  # 34,56,7   //1 to 3  //start from 1: endIndex-1
print(vals[1:-4])  # [34,56,7 ]starts from1 , till from right side upto-4
print(vals[-6:4])  # [56,7] start from right to right direction
print(vals[-4:-1])  # [8,9,23] index -4 (included) to index -1 (excluded)
print(vals[1:])
print(vals[:5])  # starts from 0 to 4
# Changeelemet Value
thislist = ["JAVA", "PHP", "jQuery"]
thislist[1] = "SQL"
print(thislist)
print("==================")

# Check if Item Exists
thislist = ["JAVA", "PHP", "jQuery"]
if "JAVA" in thislist:
  print("Yes, 'JAVA' is in the tech list")
  
# Loop Through a List
thislist = ["JAVA", "PHP", "jQuery"]
 
for x in thislist: 
    print(x)
   
# To determine how many items a list has, use the len() method:
thislist = ["JAVA", "PHP", "jQuery"]
print(len(thislist))
 
# Add Items into list
thislist = ["JAVA", "PHP", "jQuery"]
thislist.append("Ruby")
print(thislist)
 
# Remove Item
thislist.remove("PHP")
print(thislist)
 
# The pop(index) method removes the specified index, 
# (or the last item if index is not specified):
   
thislist = ["JAVA", "PHP", "jQuery"]
thislist.pop(0)
thislist.pop()  # removes last element of list
print(thislist)
print("pop==================")
# The del keyword removes the specified index:
thislist = ["JAVA", "PHP", "jQuery", "Android"]
del thislist[0]
print("this list", thislist)
print("del==================")
# The clear() method empties the list:
thislist = ["JAVA", "PHP", "jQuery", "Android"]
thislist.clear()
print(thislist)
 
# Make a copy of a list with the copy() method:
thislist = ["JAVA", "PHP", "jQuery", "Android"]
myNewlist = thislist.copy()
print(myNewlist)
print("copy==================")
# Make a copy of a list with the list() method:
thislist = ["JAVA", "PHP", "jQuery", "Android"]
mylist = list(thislist)
print(mylist)

# ####Sorting of elements###
techs = [20, 40, 5, 67, 76]
techs.sort()
print(techs)
print("==================")

print("######################")
items = [23, 4, 5, 67, 89, 1];

newList = list(items)
print("New List", newList)  # #???

