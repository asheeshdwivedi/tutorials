#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5

# Use range to genrate a list of number
a = list(range(0, 10))
print(a)

print(a[0:5])
print(a[2:len(a)])
print(a[2:])
print(a[:])

print(a[::2])
print(a[0:6:2])
print(a[0:6:3])
print(a[-1])
print(a[-2])
print(a[2:-2])

print(a[::-1])
print(a[::-2])
