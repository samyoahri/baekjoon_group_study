import sys
from collections import deque
input = sys.stdin.readline

# stack처럼 class 사용했으나 시간초과
# 무작위성 => pop(0): O(N) 따라서 deque 사용
if __name__ == '__main__':
    N = int(input().strip())
    new_q = deque([])
    for line in range(N):
        comd = input().strip().split()
        if comd[0] == 'push':
            new_q.append(int(comd[1]))
        elif comd[0] == 'pop':
            if new_q:
                print(new_q.popleft())
            else:
                print(-1)
        elif comd[0] == 'size':
            print(len(new_q))
        elif comd[0] == 'empty':
            if new_q:
                print(0)
            else:
                print(1)
        elif comd[0] == 'front':
            if new_q:
                print(new_q[0])
            else:
                print(-1)
        elif comd[0] == 'back':
            if new_q:
                print(new_q[-1])
            else:
                print(-1)
        else:
            print('It is not usable command')