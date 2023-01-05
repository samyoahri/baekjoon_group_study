import sys
import copy
input = sys.stdin.readline

if __name__ == '__main__':
    N = int(input().strip())
    seq = input().strip().split(maxsplit=N-1)
    res = []
    for i in range(len(seq)):
        seq[i] = int(seq[i])
    rln = -1
    for i in range(len(seq)-1, -1, -1):
        if seq[i] > rln:
            rln = -1
        if len(seq) > (i+1):
            p = seq.pop()
            if p > seq[i]:
                rln = p
        else:
            pass
        res.append(rln)
    for i in range(len(res)-1, -1, -1):
        print(res[i], end=' ')
    
    # for i in range(len(seq)):
    #     tmp = copy.deepcopy(seq)
    #     rln = -1
    #     while len(tmp) > (i+1):
    #         p = tmp.pop()
    #         if tmp[i] < p:
    #             rln = p
    #     print(rln, end=' ')
    
    ## timeout, 수정하겠습니다.
        