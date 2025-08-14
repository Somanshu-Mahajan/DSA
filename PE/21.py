def sum_of_divisors(n):
    sum_divs = 1  
    sqrt_n = int(n ** 0.5)
    
    for i in range(2, sqrt_n + 1):
        if n % i == 0:
            sum_divs += i
            if i != n // i:  
                sum_divs += n // i
                
    return sum_divs

amicable_numbers = set()

for a in range(2, 10000):
    b = sum_of_divisors(a)
    if b != a and sum_of_divisors(b) == a:  
        amicable_numbers.add(a)
        amicable_numbers.add(b)

print(sum(amicable_numbers))  
