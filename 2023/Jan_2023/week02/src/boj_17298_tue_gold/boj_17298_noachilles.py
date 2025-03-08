import sys
input = sys.stdin.readline

if __name__ == '__main__':
    N = int(input().strip())
    seq = list(map(int, input().split()))
    stack = []
    o_big = [-1] * N
    
    stack.append(0)
    for i in range(1, len(seq)):
        while stack and seq[stack[-1]] < seq[i]:
            o_big[stack.pop()] = seq[i]
        stack.append(i)
    print(*o_big)
    
    # for i in range(len(seq)):
    #     tmp = copy.deepcopy(seq)
    #     rln = -1
    #     while len(tmp) > (i+1):
    #         p = tmp.pop()
    #         if tmp[i] < p:
    #             rln = p
    #         else:
    #             continue
    #     print(rln, end=' ')
    # 시간초과 코드