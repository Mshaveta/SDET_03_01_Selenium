# function def.
# def display():
#     print("Display Function()");
# 
# 
# # function calling    
# display();    

# parameteric
# def sum(a, b):
#     
#     sum = a + b;
#     return sum;
# 
#   
# print("Sum is - ", sum(40, 50));  

#########################################
# def multipleVals(*nums):
#     for i in range(5):
#         print(nums[i], i);
# 
#  
# multipleVals(10, 23, 34, 45);  

#########################################
# def multiValues(*nums):
#     
#     print(nums[1])
# 
# 
# multiValues(5, 6, 7, 8)

#########################################
# def name(first, last_name):
#     print(first, last_name)
# 
#     
# name("Test", "User");   
# name(last_name="Test", first="User");
    
#########################################
# def passStmt():
#     pass;


#######################################
def greet(name):
    
    msg = """
    \"This function greets to
    the person passed in as
    a parameter\"
    """
    print(msg)
    print("Hello, " , name , ", Good morning!")
 
 
greet('Paul')

