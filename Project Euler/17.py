def strlength(str):
    return len(str)

def numberInWords(n):
    num_dict = {
        1: 'one',
        2: 'two',
        3: 'three',
        4: 'four',
        5: 'five',
        6: 'six',
        7: 'seven',
        8: 'eight',  
        9: 'nine',
        10: 'ten',
        11: 'eleven',
        12: 'twelve',
        13: 'thirteen',
        14: 'fourteen',
        15: 'fifteen',
        16: 'sixteen',
        17: 'seventeen',
        18: 'eighteen',  
        19: 'nineteen',
        20: 'twenty',
        30: 'thirty',
        40: 'forty',  
        50: 'fifty',
        60: 'sixty',
        70: 'seventy',
        80: 'eighty',
        90: 'ninety',  
    }   

    if n in num_dict:  # Direct lookup
        return num_dict[n]
    
    if 21 <= n <= 99:  # Two-digit numbers
        tens, ones = divmod(n, 10)
        return num_dict[tens * 10] + (num_dict[ones] if ones else '')

    if 100 <= n <= 999:  # Three-digit numbers
        hundreds, remainder = divmod(n, 100)
        if remainder == 0:
            return num_dict[hundreds] + 'hundred'
        else:
            return num_dict[hundreds] + 'hundredand' + numberInWords(remainder)

    if n == 1000:
        return 'onethousand'


letters = 19

for i in range(6, 1001):
    letters += strlength(numberInWords(i))

print(letters)

