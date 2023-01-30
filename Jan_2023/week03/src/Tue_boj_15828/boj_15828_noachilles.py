import sys
from collections import deque
input = sys.stdin.readline

if __name__ == '__main__':
    n = int(input().strip())
    buf = deque(maxlen=n)
    while 1:
        comd = input().strip()
        if comd == '-1':
            break
        elif comd == '0':
            buf.popleft()
        elif len(buf) < n:
            buf.append(comd)
    if buf:
        print(*buf, end=' ')
    else:
        print('empty')