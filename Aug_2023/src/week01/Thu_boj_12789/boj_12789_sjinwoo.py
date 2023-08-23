from sys import stdin

def main():
    N = int(stdin.readline().rstrip())
    number = list(map(int, stdin.readline().rstrip().split()))
    stack = list()
    print(number)
    
    for idx in range(N):
        print(idx, stack)
        if number[idx] != 1:
            stack.append(number[idx])

    if stack == stack.sort(reverse=1):
        print("Nice")
    else: print("Sad")

if __name__ == "__main__":
    main()