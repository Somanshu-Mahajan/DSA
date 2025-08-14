import math

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

num = 600851475143  
largest_prime = 1

for i in range(2, int(math.sqrt(num)) + 1):
    while num % i == 0:  
        largest_prime = i
        num //= i 

if num > 1:
    largest_prime = num

print(largest_prime)
