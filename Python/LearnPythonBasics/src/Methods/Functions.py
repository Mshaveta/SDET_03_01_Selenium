# function def.
def display():
    print("Display Function()");
 

# # function calling    
display();    


# parameteric
def sum(a, b):
     
    sum = a + b;
    return sum;
 
   
sum(2, 3)   
print("Sum is - ", sum(40, 50));  


#########################################
def multipleVals(*nums):
    count = len(nums)
    
    for i in range(count):
        print(nums[i]);
 
  
multipleVals(10, 23, 34, 45);  


#########################################
def multiValues(*nums):
     
    print(nums[1])
 
 
multiValues(5, 6, 7, 8)


#########################################
def name(first, last_name):
    print(first, last_name)
 
     
name("Test", "User");   
name(last_name="Test", first="User");

    
#########################################
def passStmt():
    pass;


#######################################
def greet(name):
    
    msg = """
    \"This function greets to
    the person passed in as
    a parameter\"
    """
    print("pre tag Msg is-", msg)
    
    msg = " \"This function greets to the person passed in as a parameter\" "
    print("New Msg is-", msg)
    print("Hello, " , name , ", Good morning!")
 
 
greet('Paul')

