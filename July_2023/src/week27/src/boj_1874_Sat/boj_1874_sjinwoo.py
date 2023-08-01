from sys import stdin

def main():
    n = int(stdin.readline().strip())

    sequence = list()
    for _ in range(n):
        sequence.append(int(stdin.readline().strip()))

    stack = list()
    result = list()
    for k in range(1, n+1):
        stack.append(k)
        result.append('+')
        while stack != [] and sequence != [] and stack[-1] == sequence[0]: 
            stack.pop()
            sequence.pop(0)
            result.append('-')

    if sequence == []: 
        for op in result: print(op)
    else:
        print('NO')
    


 
if __name__ == "__main__":
    main()