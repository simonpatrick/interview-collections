# -*- coding: utf-8 -*-
"""returning None or default value, when key is not in dict"""
d = {'a': 1, 'b': 2}

print(d.get('c', 3))
print(d)

