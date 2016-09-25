#!/Library/Frameworks/Python.framework/Versions/3.5/bin/python3.5
#firstName, M. lastName
firstName = str(input("Please enter your first name : "))
middleName = str(input("Please enter your middle name : "))
lastName = str(input("Please enter your last name : "))

firstName = firstName.capitalize()
middleName = middleName.capitalize()
lastName = lastName.capitalize()

#.1s is first char of that string
name_format = "{firstName} {middleName:.1s} {lastName}"

print(name_format.format(firstName=firstName ,middleName=middleName ,lastName=lastName))
