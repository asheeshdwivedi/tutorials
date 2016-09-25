#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5
n=11
f=1.23456
s="Asheesh is Grate !!!!!!!!!"
print("My number is {:d}".format(n)) # {:d}print  n in decimal
print("My number is {:b}".format(n)) #{:b} print n in binary
print("My number is {:f}".format(f)) #{:f} print f in floting point
print("My number is {:.3f}".format(f)) #{:.3f} print in floting point with the decimal persion of 3
'''{:11.3f} print in floting point with the decimal persion of 3 and append 11 char of padding'''
print("My number is {:11.3f}".format(f))
'''{:011.3f} print in floting point with the decimal persion of 3 and append 11 char of padding with 0'''
print("My number is {:011.3f}".format(f))
print("{0} {1} {2}".format(n, f, s))

print("{name} has {toys} toys with her and she likes to play with her friend {friend}".format(
    name = "Apoorva",
    toys = 4,
    friend = "Surya Malika"

))
