def fibonacci(n):
    sum, a, b = 2, 1, 2
    c = a + b
    while c <= n:
        a = b
        b = c 
        c = a + b
        
        if c % 2 == 0:
            sum += c
    return sum

print(fibonacci(4000000))