names = []

with open("./txt files/names.txt", 'r') as file:
    for line in file:
        items = [item.strip().strip('"') for item in line.strip().split(',')]
        names.extend(items)

names.sort()

def nameWorth(name):
    worth = 0
    for i in name:
        worth += ord(i) - 64
    return worth

totalNamesScores = 0

for i in range(1, len(names) + 1):
    totalNamesScores += nameWorth(names[i - 1]) * i

print(totalNamesScores)
