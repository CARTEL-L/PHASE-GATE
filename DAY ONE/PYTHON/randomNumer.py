import random
for random_num in range(1, 100):
    number = int(input('Enter number: '))
    if(number <= random_num):
        print('Higher')
    elif(number >= random_num):
        print('Lower')
    elif(number > 100):
        print('bad attempt')
        continue
    elif(number < 0):
        print('bad attempt')
        continue
    elif(len(number) == 5):
        break
    elif(number == random_num):
        break

















print(random.randrange (1,100))
