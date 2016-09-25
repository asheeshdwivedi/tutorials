#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5
alpha1 = ['q', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p']
alpha2 = ['a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l']
alpha3v = "zxcvbnm"

alpha1.insert(1, 'w')

print(alpha1)

alpha1 = '-'.join(alpha1)
print(alpha1)

number = [3.14, -5, 10, 10**4, 17]
hello_world ="HelloWorld"

# min max , sum, len
print(min(number))
print(max(number))
print(sum(number))
print(len(number))

print(min(hello_world))
print(max(hello_world))
print(len(hello_world))
