from sys import stdin

def main():
    string = stdin.readline().strip()
    bomb = stdin.readline().strip()
    
    lst = list()

    for char in string:
        lst.append(char)
        if "".join(lst[-len(bomb):]) == bomb:
            for _ in bomb: lst.pop()
    if lst == []: print("FRULA")
    else: print("".join(lst))
        
if __name__ == "__main__":
    main()