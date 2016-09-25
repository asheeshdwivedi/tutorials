#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5

number = [1, 2, 3, 4, 5]

print(number)

print(number[1])

del number[1]

print(number)

alpha = ['a', 'b', 'c', 'd']

print(alpha)
alpha.append('e')

print(alpha)

alpha = alpha + ['f', 'g']

print(alpha)

d_index = alpha.index('d')

print('D_index : ' + str(d_index))

del alpha[d_index]

print(alpha)

alpha.remove('c')

print(alpha)
