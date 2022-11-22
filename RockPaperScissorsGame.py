import random
import time


def mainMenu():
    print("\n\nWelcome to Rock Paper Scissors Game!")
    time.sleep(1)
    userChoice = input("Do you want to play? [ 'y' or 'n' ]  :  ")
    if(userChoice == "y"):
        game()
    if(userChoice == "n"):
        print("\nThanks for your interesting")

def choiceMenu():
    time.sleep(1)
    userChoice = input("\n\nDo you want to play another round? [ 'y' or 'n' ]  :  ")
    if(userChoice == "y"):
        game()
    if(userChoice == "n"):
        print("\nThanks for playing ... See ya! ...")

def game():
    time.sleep(1)
    userChoice = input("\nPlease choice [ 'r', 'p', 's' ]  :  ")
    computerChoice = random.randrange(2)
    time.sleep(1)
    print("\nYour choice is " + userChoice + " and computer choice is " + str(computerChoice))
    time.sleep(1)
    if(computerChoice == 0 and userChoice == "r" or computerChoice == 1 and userChoice == "p" or computerChoice == 2 and userChoice == "s" ):
        print("\nDraw match ... ")
        time.sleep(1)
        choiceMenu()
    elif(computerChoice == 0 and userChoice == "p" or computerChoice == 1 and userChoice == "s" or computerChoice == 2 and userChoice == "r"):
        print("\nYou win! ... ")
        time.sleep(1)
        choiceMenu()
    else :
        print("\nComputer wins! ... ")
        time.sleep(1)
        choiceMenu()

mainMenu()