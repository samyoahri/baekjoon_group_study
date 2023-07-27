from sys import stdin

def main():
    K = int(input())
    PS = []

    for _ in range(K):
        PS.append(stdin.readline().strip())
    
    for current_PS in PS:
        stack = []
        for p in current_PS:
            if p == '(':
                stack.append(p)
            else:
                if stack == []: 
                    stack.append(-1)
                    break
                stack.pop()

        if len(stack) > 0: print('NO')
        else: print('YES')


if __name__ == "__main__":
    main()