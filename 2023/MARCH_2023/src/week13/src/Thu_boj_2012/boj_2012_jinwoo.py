import sys

def main():
    N = int(input())

    score_pred = list()
    for _ in range(N):
        score_pred.append(int(sys.stdin.readline()))
    score_pred.sort()

    complain = 0
    for i in range(1, N+1):
        complain += abs(i - score_pred[i-1])

    print(complain)
        
if __name__ == '__main__':
    main()