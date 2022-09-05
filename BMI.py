
# Welcome Message

from ast import And
import re


print("Welcome to BMI calculator!")
height = input("Height in Meter - ")
weight = input("Weight in Kilogram - ")

heightToInt = float(height)
weightToInt = float(weight)

# Height converting

height_converted = heightToInt * heightToInt

# BMI formula and calculation

result = weightToInt / height_converted

# Format to 1 decimal point

bmi_result = "{:.1f}".format(result)

print("Your BMI result is " + bmi_result)

# Check the condition for result

if(result < 18.5):
    print("You are Under-weight!")
if(result > 18.5 and result <= 24.9):
    print("You are Healthy-weight!")
if(result >= 25.0 and result <= 29.9):
    print("You are Over-weight!")
if(result > 30):
    print("You are Obesity!!")
else:
    print("Invalid!")