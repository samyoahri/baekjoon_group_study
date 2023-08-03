from sys import stdin

def main():
    S = stdin.readline().strip()

    result = str()
    char_list = list()

    tag = 0

    for char in S:
        if char == '<':
            tag = 1
            result += "".join(char_list)[::-1]
            char_list.clear()
            result += char
            continue

        elif char == '>':
            result += "".join(char_list)
            char_list.clear()
            result += char
            tag = 0
            continue
        
        elif char == ' ':
            if tag == 0:
                result += "".join(char_list)[::-1] + ' '
                char_list.clear()
            else:
                char_list.append(char)
        
        else: char_list.append(char)
    
    if char_list != []: result += "".join(char_list)[::-1]

    print(result)

if __name__ == "__main__":
    main()