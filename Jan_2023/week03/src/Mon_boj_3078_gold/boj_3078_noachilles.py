import sys
from collections import deque
input = sys.stdin.readline

if __name__ == "__main__":
    que = deque([])
    grade = [0] * 21
    cnt = 0
    n, k = map(int, input().strip().split())
    l = n
    for i in range(n):
        name = len(input().strip())
        que.append(name)
        grade[name] += 1
        if len(que) > 0:
            if len(que) > k+1:
                old = que.popleft()
                grade[old] -= 1
            cnt += (grade[name] - 1)
    print(cnt)

# *