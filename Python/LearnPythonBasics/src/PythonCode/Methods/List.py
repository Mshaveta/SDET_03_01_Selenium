# duplicate elements
# hetrogenous
# changeable
# indexed
# ordered

a = [10, 20, 30, 40, 56, 78, 89, 56, 45]
# print(a)

###########################
# print(a[0])
# print(a[-1])  # - represents reverse order
# print(a[:])
# print(a[2:])
# print(a[-2:])
# print(a[:-5])
# print(a[2:7])  # 2,3,4,5,6

################ Nested List ######################
newList = [10, 20, 45, 56, 67, 56, 56, 56, 78, 23, 34, [23, 45, 56]]
# print(newList)
# print(newList[2][1])

#####################################

newList[0] = 40

############################################
newList.insert(2, "Testing")
 
##################################
newList.append("API")

######################################
# newList.pop(0) 
# print(newList)

# newList.pop() 

######################################
# newList.remove("API")
# print(newList)

##############################
# del newList[0:2]
# print(newList)
newList = [10, 56, [45, 56, 56, 56]]
countVal = newList.count(56);
print(countVal)

######################################
 
