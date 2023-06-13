arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

min_val = int(input("Введите минимальное значение: "))
max_val = int(input("Введите максимальное значение: "))

indexes = []

for i in range(len(arr)):
    if min_val <= arr[i] <= max_val:
        indexes.append(i)

print(indexes)
