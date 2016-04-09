# -*- coding: utf-8 -*-


# file input
import fileinput

for line in fileinput.input('sample_text.txt','r'):
    print(line)