from sys import stdin

def main():
    N = int(stdin.readline().strip())
    P = list(map(int, stdin.readline().strip().split()))
    P.sort()

    result = 0
    for _ in range(N):
        result += sum(P)
        P.pop()

    print(result)
        
if __name__ == "__main__":
    main()