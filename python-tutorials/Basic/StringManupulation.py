#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5

# String comes with three flavor

single_quote_string = 'single_quote_string'
double_quote_string = "double_quote_string"

# Triple qoute string;

paragraph = '''This is
a long String mind it :) '''
print(paragraph)

# Three Quotes can be use as a Comments
'''String API '''

apple = 'apple'
print(apple)
apple = apple.upper()
print(apple)

science = 'SCIENCE'
print(science)
science = science.lower()
print(science)
print(science.title())

apple = '           apple           '
print(apple)
print(apple.strip().upper())

prefix = "Python is an "
suffix = "awesome language. "

concatinate = prefix + suffix
print(concatinate)

concatinate = concatinate.replace('language', 'snake')
print(concatinate)

concatinate = concatinate * 2# make the same string twice
print(concatinate)
concatinate = concatinate.replace('snake', 'language')
print(concatinate)

concatinate = concatinate.replace('language', 'snake', 1)
print(concatinate)

print(concatinate.count('an'))
