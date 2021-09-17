# Dictionary is a collection which is unordered, 
# changable and indexed. No duplicate members.

techs = {}
techs["user1"] = "PHP"
techs["user2"] = "SQA"
techs["user3"] = "SDET"
 
print("start dict.-", techs)

print("##################")
techs = {
    "user1" : "PHP",
    "user2" : "SQA",
    "user3" : "SDET",
    "user3" : "DS",
}

print("chk duplicay in  dict.-", techs)

techs["user6"] = "Python";
techs["user1"] = "JQuery";

print("change  dict. value-", techs)

del techs["user2"]

print("after del", techs)
print("##################")

elm = techs.get("user3");
print(elm)
print("##################")

techs = {
    "user1" : "PHP1",
    "user2" : "SQA1",
    "user3" : "DS1",
}
for x in techs.keys():
  print(x)
  
for x in techs.values():
  print(x)
 
for uname, tech in techs.items():
    print("tech value of " + uname + " is " + tech)
    # print("tech of  %s is %s" % (uname, tech))
    
techs.pop("user1")   
print(techs) 
     
