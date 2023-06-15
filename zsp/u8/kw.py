import os

def show_contacts (file_name):
    os.system('CLS')
    with open(file_name, 'r') as file:
        data = file.readlines()

        for contact in data:
            print (contact, end='')

    input('\npress any key')

def add_contact (file_name):
    os.system('CLS')
    with open(file_name, 'a') as file:
        res = ''
        res += input ('Input a surname of contact: ') + ' ' 
        res += input('Input a name of contact: ') + ' '
        res += input( 'Input a phone number of contact: ')

        file. write('\n' + res)

    input('press any key')

def search_contact (file_name):
    os.system('CLS')
    target = input ('Input a name of contact for searching: ')
    
    with open(file_name, 'r') as file:
        data = file.readlines()

        found = False
        for contact in data:
            if target in contact:
                print (contact)
                found = True
                break

        if not found:
            print('there is no contacts with this name.')

    input('press any key')

def edit_contact(file_name):
    os.system('CLS')
    target = input('Input a name or surname of contact for editing: ')

    with open(file_name, 'r') as file:
        data = file.readlines()

    with open(file_name, 'w') as file:
        for line in data:
            if target in line:
                print(f'Current contact info: {line}')
                print('Input new contact info:')
                line = ''
                line += input ('Input a surname of contact: ') + ' ' 
                line += input('Input a name of contact: ') + ' '
                line += input('Input a phone number of contact: ')
                line += '\n'
            file.write(line)

    input('press any key')

def delete_contact(file_name):
    os.system('CLS')
    target = input('Input a name or surname of contact for deletion: ')

    with open(file_name, 'r') as file:
        data = file.readlines()

    with open(file_name, 'w') as file:
        for line in data:
            if target not in line:
                file.write(line)

    input('press any key')

def drawing():
    print('1 - show contacts')
    print('2 - add contact')
    print('3 - search contact')
    print('4 - edit contact')
    print('5 - delete contact')
    print ('6 - exit')

def main(file_name):
    while True:
        os.system('CLS')
        drawing()
        user_choise = int(input("Input a number from 1 to 6."))

        if user_choise == 1:
            show_contacts(file_name)
        elif user_choise == 2:
            add_contact(file_name)
        elif user_choise == 3:
            search_contact(file_name)
        elif user_choise == 4:
            edit_contact(file_name)
        elif user_choise == 5:
            delete_contact(file_name)
        elif user_choise == 6:
            print('Have a nice day!')
            return

main("test.txt")