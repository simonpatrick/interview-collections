letter_counter = {}
for letter in 'MIssissippi':
    letter_counter[letter] = letter_counter.get(letter, 0) + 1

print(letter_counter)