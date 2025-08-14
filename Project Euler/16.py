def sumOfDigits(n):
    sum = 0
    while n > 0:
        sum += n % 10
        n //= 10

    return sum

prod = 32768

for i in range(16, 1001):
    prod *= 2

print(sumOfDigits(prod))