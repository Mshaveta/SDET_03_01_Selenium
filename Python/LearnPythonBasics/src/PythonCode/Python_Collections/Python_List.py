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
# # print(a[0])
# # print(a[-1])  # - represents reverse order
# # print(a[:])
# # 
# # print(a[2: ])
# # 
# # print("reverse list - ", a[-4:])  #  
# # 
# # print("Values with end index rev. order-", a[:-5])  #### start index= 0, end = -5
# # print("values are:- ", a[0:4])
# # print(a[2:7])  # 2,3,4,5,6
# 
# ################ Nested List ######################
# newList = [10, 20, [23, 45, 56]]
# # print(newList)
# # print(newList[2][0])
# # print(newList[2][1])
# # print(newList[2][2])
# 
# #####################################
# 
# newList[0] = 40
# # print(newList)
# # ############################################
# newList.insert(2, "Testing")
#  
# # ##################################
# newList.append("API")
# # print(newList)
#  
# ######################################
# newList.pop(0) 
# # print("pop element placed at index 0", newList)
# # print(newList)
#  
# newList.pop() 
# # print("remove last elment- ", newList)
#  
# ######################################
# # newList.remove("API")
# # print("Remove Elmeent - ", newList)
#  
# ##############################
# # del newList[0:2]
# # print(newList)
# 
# newList = [10, 56, 45, 56, 56, 56]  # Nested List count elmns??? 
# countVal = newList.count(56);
# print("Count value of 56- ", countVal)
#  
# ######################################
# 
# # List
# x = [0, 1, 2, 2, 2]
# print (x);
# print("==================")
#  
# x[1] = 8
# print (x);
#  
# print("==================")
# x = [0, 1, [2, 1, 2, 3, 4], 5]  # index-2 - [0->2]
# x.append(5)
# x[2][4] = 3
#   
# x[2].append(10);
#  
# print ("Append value in inner list-", x);
# print("==================")
# x[2].append(4)
# print (x);
# print("==================")
#  
# x[2] = 2
# print (x);
# print("==================")
# ####Sorting of elements###
# techs = [20, 40, 5, 67, 76]
# 
# techs.sort()
# print(techs)
# print("==================")
# # Access the item
# tech = ["JAVA", "PHP", "jQuery"]
# print(tech[1])
# print("==================")
# Negative indices can be used to index the list from right.
 
vals = [12, 34, 56, 7, 8, 9, 23, 44] 
# 0-7
# rev-  -1 - -8

print(vals[-1:-4])  # ???  

# Changeelemet Value
thislist = ["JAVA", "PHP", "jQuery"]
thislist[1] = "SQL"
print(thislist)
print("==================")

# Loop Through a List
thislist = ["JAVA", "PHP", "jQuery"]
 
for x in thislist: 
    print(x)
     
# Check if Item Exists
thislist = ["JAVA", "PHP", "jQuery"]
if "JAVA" in thislist:
  print("Yes, 'JAVA' is in the tech list")
   
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

