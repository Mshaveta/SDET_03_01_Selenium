# Python Output Using print() function
a = 5
print('The value of a is', a)

print(1, 2, 3, 4)
print(1, 2, 3, 4, sep='*')
print(1, 2, 3, 4, sep='#', end='&')

x = 5; y = 10
print('The value of x is {} and y is {}'.format(x, y))
 
print('I love {0} and {1}'.format('bread', 'butter'))
print('I love {1} and {0}'.format('bread', 'butter'))

print('Hello {name}, {greeting}'.format(greeting='Goodmorning', name='John'))
 
# Python Import
import math

# or
from math import pi
print(math.pi)
