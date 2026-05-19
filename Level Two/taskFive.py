number = int(input("Enter number: "))
number_two = int(input('Enter second number: '))
number_three = int(input('Enter third number: '))

if(number > number_two and number > number_three):
    print(number)
if(number_two > number_three and number_two > number):
    print(number_two)
elif(number_three > number_two and number_three > number):
    print(number_three)
