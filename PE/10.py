import math

def isPrime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

sum = 17
num = 2000000

for i in range(11, num + 1):
    if isPrime(i):
        sum += i
    
print(sum)