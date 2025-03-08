if __name__ == '__main__':
    N = int(input())
    group = N
    for line in range(N):
        cnt = 0
        word = input()
        for i in range(len(word)-1):
            if word[i] == word[i+1]:
                continue
            elif word[i] in word[i+1:]:
                cnt += 1
        if cnt != 0:
            group -= 1
    print(group)