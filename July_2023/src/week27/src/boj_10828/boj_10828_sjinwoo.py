from sys import stdin

def main():
    N = int(stdin.readline().strip())
    stack = []
    commands = []
    for _ in range(N):
        commands.append(stdin.readline().strip().split())
        
    for command in commands:
        if command[0] == 'push':
            stack.append(int(command[1]))

        elif command[0] == 'pop':
            if stack == []: print(-1)
            else: print(stack.pop())

        elif command[0] == 'size':
            print(len(stack))

        elif command[0] == 'empty':
            if stack == []: print(1)
            else: print(0)

        elif command[0] == 'top':
            if stack == []: print(-1)
            else: print(stack[-1])

        
if __name__ == "__main__":
    main()