# List is mutable
 
listRes = [12, 23, 4, 56]
print(listRes)

print(listRes[0])
print(listRes[0 :2])  # exclusive 2

# combine two lists
listRes1 = [121, 50, "23", 341, 156]
newList = [listRes, listRes1]
print(newList)

# Diff. list operations
# insert into list
 
 
 newList[1].remove("23");
 print(newList)

 newList.pop(0);
 print(newList)
 
 newList.pop();  # remove last element
 print(newList)

# To delete multiple values 
 del newList[2:]
 
 newList.extend([231, 56, 5, 6])
 print(newList)
 
print(min(listRes))
 
print(max(listRes))
print(sum(listRes))

listRes.sort()
print(listRes)

