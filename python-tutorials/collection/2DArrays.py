#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5

# import the pprint function from the pprint module as a function
# called pretty_print
from pprint import pprint as preety_print
from copy import copy, deepcopy
# import the copy and deepcopy function from the copy module '''

numbs_2d = [
    [1, 2, 3, 4, 5, 6, 7, 8, 9],
    [10, 11, 12, 13, 14, 15, 16, 17, 18, 19],
    [20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
]

print(numbs_2d[1][1])

print(numbs_2d)
preety_print(numbs_2d)
numbs_2d[2][1] = -5
preety_print(numbs_2d)

latters = ["A", "B", "C", "D"]
latter_2d = [latters, latters, latters]
preety_print(latter_2d)
latter_2d[0][0] = "F"

preety_print(latter_2d)

lattersToCopy = ["A", "B", "C", "D"]
latter_2dCopy = [copy(lattersToCopy), copy(lattersToCopy), copy(lattersToCopy)]

preety_print(latter_2dCopy)
latter_2dCopy[0][0] = "F"

preety_print(latter_2dCopy)
