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
        chkout = False
        for i in range(n):
            if parrot_in[i] and parrot_out[0] == parrot_in[i][0]:
                parrot_out.popleft()
                parrot_in[i].popleft()
                chkout = True
                break
        if not chkout:
            break
    chkin = True
    for i in range(n):
        if parrot_in[i]:
            chkin = False
        else:
            continue
    if parrot_out or not chkin:
        print('Impossible')
    else:
        print('Possible')