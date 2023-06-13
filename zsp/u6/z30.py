a1 = int(input("Введите первый элемент прогрессии: "))
d = int(input("Введите разность прогрессии: "))
n = int(input("Введите количество элементов прогрессии: "))

sequence = []

for i in range(n):
    an = a1 + i * d
    sequence.append(an)
print(sequence)
