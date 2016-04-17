# -*- coding: utf-8 -*-

"""
See description here
https://gist.github.com/hrldcpr/2012250
"""

from collections import defaultdict

tree = lambda: defaultdict(tree)


users = tree()
users['harold']['username'] = 'chopper'
users['matt']['password'] = 'hunter2'

print(users)
for item in users.items():
    print(item)
