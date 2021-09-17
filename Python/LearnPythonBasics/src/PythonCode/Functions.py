def display():
    print("Hello from a function")


display();


def paramFunc(fname):
  print(fname)


paramFunc("PHP")
 
 
def print_marks(*marks):
     
        print("marks  " + marks[2])


print_marks("10", "20", "30") 

print("===================")


def print_values(name, id):
  print("name and id is ", name, id)


print_values(id="123", name="B")
 
