from sys import stdin

def main():
    list_string = list()
    while True:
        input_string = stdin.readline().rstrip()
        if input_string == '.': break
        list_string.append(input_string)
        
    for string in list_string:
        stack = list()
        for char in string:
            if char == '(': stack.append(char)
            elif char == '[': stack.append(char)
            elif char in ')]':
                if stack == []:
                    stack.append('')
                    break      
                else:
                    top = stack.pop()
                    if top + char != '()' and top + char != '[]':
                        stack.append('')
                        break

        if stack == []: print('yes')
        else: print('no')
    

if __name__ == "__main__":
    main()