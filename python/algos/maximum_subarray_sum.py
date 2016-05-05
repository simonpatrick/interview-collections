# -*- coding: utf-8 -*-


def maximum_sub_array_sum(array=[]):
    max_ending_here = max_so_far = array[0]
    for item in array[1:]:
        max_ending_here = max(0, max_ending_here + item)
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far


print(maximum_sub_array_sum([-2, 1, -3, 4, -1, 2, 1, -5, 4]))