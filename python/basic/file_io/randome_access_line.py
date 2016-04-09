# -*- coding: utf-8 -*-
# will not read file into memory

print(__file__)
sum=0
# generator
with open('sample_text.txt','r') as f:
    for line in f:
        sum+=1
        print(line)
print(sum)
sum=0

# read line
big_file = open('sample_text.txt','rt')
line = big_file.readline()
while line:
    line=big_file.readline()
    sum+=1
    print(line)

big_file.close()

print(sum)


