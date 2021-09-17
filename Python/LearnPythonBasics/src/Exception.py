# #try{
#     x = 10/0;
# }catch(execption e){
#    e.printstacktrace();
#     
# }finally{
# syso();
#     }

print("Start");

try:
    x = 10 / 0;
except Exception as ae:
    print(ae) 
    # print("Oops!", sys.exc_info()[0], "occurred.")
    print("Oops!", ae.__class__, "occurred.")
    
print("Stop")
print("===========================================")   

try:
    # a = int(input("enter value"));
   # x = 10 / a;  # number/ str--valueError
    
    a = int(input("enter value"));  # str
    x = 10 / a;  # number/ str---typeError
except Exception as ae:
    print("Exception class ", ae. __class__)   
except ZeroDivisionError as ze:
    print("ZeroDivisionError class ", ze); 
except TypeError as te:
    print("TypeError class - ", te);  
except ValueError as ve:
    print("valueError class - ", ve);    
    
print("Stop Multiple catch blocks")
print("===========================================")      
     
try:
    print("hello")
except:
    print("Something went wrong")
finally:
    print("finally Block") 
  
y = 20


def cutomError():
    
    if y > 0:
        raise Exception("Sorry, no numbers below zero")    


try:    
    cutomError();
except Exception as e:
    print(e)
    
print("Exit")
