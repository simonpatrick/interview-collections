# -*- coding: utf-8 -*-

"""set global variables from dict"""

d = {'a': 1, 'b': 'var2', 'c': [1, 2, 3]}
globals().update(d)
print(a, b, c)
print(globals())
print('a' in globals().keys())
    