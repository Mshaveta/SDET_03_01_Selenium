from array import array

arr = array('i', [])
n = int(input("Enter size of an array"))
for i in range(n):
    val = int(input("Enter next value"))
    arr.append(val)
    print(arr[i], end="")
    print("\n")
print(arr)  

########search element##########
k = 0;
serElm = int(input("Enter the element want to be search from an  array"))
for j in arr:
    if serElm == j :
        print(k)
        break;
    
    k += 1;
  
