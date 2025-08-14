def sumofSquares(n):
    res = n
    res *= (n + 1)
    res *= (2*n + 1)
    res //= 6
    return res

def squareOfSum(n):
    res = n
    res *= (n + 1)
    res //= 2
    return (res ** 2)

print(squareOfSum(100) - sumofSquares(100))