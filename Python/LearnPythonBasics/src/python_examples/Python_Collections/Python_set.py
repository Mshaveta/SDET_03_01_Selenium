# A set is a collection which is unordered and unindexed,unchangable
# In Python sets are written with curly brackets. {}
# You cannot access items in a set by referring to an index, 
# since sets are unordered the items has no index.
# Change Items - Once a set is created, you cannot change its items, 
# but you can add new items.
# methods:

# remove()- to remove item (But remove () will raise an error in such condition  )
# discard() -to remove item (discard () if the item does not exist in the set, 
# it remains unchanged.)
# pop(), method can't to remove any item at specified index no, 
# 
# but this method will remove the last item. 
# The clear() method empties the set:
# The del keyword will delete the set completely:
# It is also possible to use the set() constructor to make a set.

techs = {"JAVA", "PHP", "jQuery", "PHP"}

print(techs)

techs.discard("SQA");  # no Error if elm not pres
techs.remove("PHP")  # error if not prs.
print("Elements - ", techs);
print("###############")
newSet = set(techs)
print("NewSet", newSet)
print(type(techs))
 
print("###############")
# Loop Through a List
thislist = {"JAVA", "PHP", "jQuery"}
for x in thislist: 
    print(x)
print("###############")  
# Check if Item Exists
thislist = {"JAVA", "PHP", "jQuery"}
if "JAVA" in thislist:
    print("Yes, 'JAVA' is in the tech list")
 
print("###############")  
# To determine how many items a list has, use the len() method:
thislist = {"JAVA", "PHP", "jQuery"}
print(len(thislist))
print("###############")
# Add Items - To add one item to a set use the add() method.
thisset = {"JAVA", "PHP", "jQuery"}
 
print("###############")
 
thisset.add("Android")
print(thisset)
print("###############")
# Add multiple items to a set, using the update() method:
thisset = {"JAVA", "PHP", "jQuery"}
 
thisset.update(["SQL", "Javascript", "HTML"])
 
print(thisset)
print("###############")
# To determine how many items a set has, use the len() method.
thisset = {"apple", "banana", "cherry"}
 
print(len(thisset))
print("###############")
 
thisset = {"JAVA", "PHP", "jQuery"}
print(thisset)
thisset.remove("PHP")
print(thisset)
thisset.pop()
print(thisset)
 
print("###############")
del(thisset)
# print("after deleting elms-", thisset)
 
