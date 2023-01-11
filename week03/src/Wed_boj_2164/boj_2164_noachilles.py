import sys
from collections import deque
input = sys.stdin.readline

if __name__ == "__main__":
    n = int(input().strip())
    que = deque([x+1 for x in range(n)])
    while len(que) > 1:
        que.popleft()
        que.append(que.popleft())
    print(*que)