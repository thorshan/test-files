
from contextlib import nullcontext


username = nullcontext
password = nullcontext
is_correct = True

while(is_correct):
    if(username == nullcontext):
        input_username = input("Username - ")
        if(input_username.__eq__("admin")):
            username = input_username
    else:
        if(password == nullcontext):
            input_password = input("Password - ")
            if(input_password.__eq__("12345")):
                password = input_password
                print("Welcome User!")
