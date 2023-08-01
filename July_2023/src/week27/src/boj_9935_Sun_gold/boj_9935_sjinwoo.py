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

    # 영목이형 보시오. 이래도 파이썬 안해?
    # lst = ['A', 'c', 4]
    # print(", ".join(list(map(str, lst))))
        
if __name__ == "__main__":
    main()