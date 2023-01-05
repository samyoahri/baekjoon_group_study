import sys
input = sys.stdin.readline

if __name__ == '__main__':
    num_stk = []
    res = []
    idx = 1
    N= int(input().strip())
    for i in range(N):
        num = int(input().strip())
        while idx <= num:
            num_stk.append(idx)
            res.append('+')
            idx += 1
        if num_stk[-1] == num:
            num_stk.pop()
            res.append('-')
    if num_stk != []:
        print('NO')
    else:
        for tag in res:
            print(tag)