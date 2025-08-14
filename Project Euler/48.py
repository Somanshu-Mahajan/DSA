import math
memo = {1: 1} 

def powerOfSelfSum(n):
    if n in memo: 
        return memo[n]

    memo[n] = powerOfSelfSum(n - 1) + int(math.pow(n, n))
    return memo[n]

num = powerOfSelfSum(1000)
res = []
for i in range(0, 10):
    res.append(num % 10)
    num //= 10

i = 9
while i >= 0:
    print(res[i])
    i -= 1

