import math

num = range(3, 21)

lcm = 1

for i in num:
    lcm = math.lcm(lcm, i)

print(lcm)