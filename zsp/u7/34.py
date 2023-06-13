def count_vowels(s):
    vowels = 'аеёиоуыэюя' # Гласные буквы
    return sum(c in vowels for c in s)

poem = input()
phrases = poem.split()
vowel_counts = [count_vowels(phrase) for phrase in phrases]
 
if len(set(vowel_counts)) == 1:
    print("Парам пам-пам")
else:
    print("Пам парам")
