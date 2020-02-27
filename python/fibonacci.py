
def fibonacci_without_recursion(number):
    if number == 0: return 0
    fibonacci0, fibonacci1 = 0, 1
    print(fibonacci0)
    print(fibonacci1)
    for i in range(2, number + 1):
        fibonacci1, fibonacci0 = fibonacci0 + fibonacci1, fibonacci1
        print(fibonacci1)

if __name__ == '__main__':
    userInput = int(input('Enter the number up to which you wish to calculate fibonnaci series: '))
    fibonacci_without_recursion(userInput)
