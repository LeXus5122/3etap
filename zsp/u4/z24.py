def max_berries(bushes):
    sums = [0] * len(bushes)
    for i in range(len(bushes)):
        sums[i] = bushes[i] + bushes[(i - 1) % len(bushes)] + bushes[(i + 1) % len(bushes)]
    return max(sums)

n = int(input("Введите количество кустов: "))
bushes = list(map(int, input("Введите количество ягод на каждом кусте, разделенное пробелами: ").split()))

print(max_berries(bushes))
