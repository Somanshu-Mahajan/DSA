import math

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def nthPrime(n):
    count = 0
    num = 1 

    while count < n:
        num += 1  
        if is_prime(num):
            count += 1

    return num

print(nthPrime(10001)) 
