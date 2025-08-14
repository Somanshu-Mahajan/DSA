def factorial(n):
    res = 2
    for i in range(3, n + 1):
        res *= i
    return res

def sumOfDigits(n):
    sum = 0

    while n > 0:
        sum += n % 10
        n //= 10
    return sum

print(sumOfDigits(factorial(100)))