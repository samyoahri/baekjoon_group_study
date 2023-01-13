from collections import deque
import sys
input = sys.stdin.readline

if __name__ == "__main__":
    n = int(input().strip())
    parrot_in = list()
    for i in range(n):
        parrot_in.append(deque(map(str, input().strip().split())))
    parrot_out = deque(map(str, input().strip().split()))
    while parrot_out:
        chk = False
        word = parrot_out[0]
        for i in range(n):
            if parrot_in[i] and word == parrot_in[i][0]:
                parrot_out.popleft()
                parrot_in[i].popleft()
                chk = True
                break
        if not chk:
            break
    if parrot_out:
        print('Impossible')
    else:
        print('Possible')