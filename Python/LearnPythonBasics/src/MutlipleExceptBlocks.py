a = 10
b = 0
     
try:
   
    c = a / b;
    
except ZeroDivisionError as  e :
    print("ZeroDivisionError :-", e)
except Exception as  e :
    print("Something went wrong:-", e)
    
finally:
    print("finally Block") 
 
