if __name__ == "__main__":
    cnt_see = set()
    cnt_hear = set()
    cnt_any = set()
    N, M = input().split()
    N = int(N)
    M = int(M)
    for line in range(0, N+M):
        name = input()
        if line < N:
            cnt_see.add(name)
        elif line < N + M:
            cnt_hear.add(name)
    cnt_any = sorted(cnt_see & cnt_hear)
    print(len(cnt_any))
    for name in cnt_any:
        print(name)