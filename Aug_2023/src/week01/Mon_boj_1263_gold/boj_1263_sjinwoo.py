from sys import stdin

def main():
    N = int(stdin.readline().strip())
    T_S = list()

    for _ in range(N):
        work = list(map(int, stdin.readline().strip().split()))
        T_S.append(work)
    T_S.sort(key = lambda x: (x[1],  x[0]))

    start = T_S[0][1] - T_S[0][0]

    for i in range(1, N):
        t = T_S[i-1][1] + T_S[i][0]
        if t > T_S[i][1]: 
            start -= t - T_S[i][1]
        else:
            T_S[i][1] = t
            
    if start < 0: print('-1')
    else: print(start)
    
if __name__ == "__main__":
    main()
    