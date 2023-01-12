import sys
from collections import deque
input = sys.stdin.readline

if __name__ == "__main__":
    n, k = map(int, input().strip().split())
    que = deque([i+1 for i in range(n)])
    res = list()
    i = 1
    while que:
        if i % k == 0:
            res.append(que.popleft())
        else:
            que.append(que.popleft())
        i += 1
    
    print('<', end='')
    print(*res, sep=', ', end='')
    print('>', end='')