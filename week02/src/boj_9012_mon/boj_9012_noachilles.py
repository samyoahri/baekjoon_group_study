if __name__ == "__main__":
    T = int(input())
    for line in range(T):
        word_lst = []
        is_VPS = True
        word = input()
        for i in range(len(word)):
            if word[i] == '(':
                word_lst.append(word[i])
            elif word[i] == ')':
                if(word_lst == []):
                    is_VPS = False
                    break
                else:
                    word_lst.pop()
        if word_lst:
            is_VPS = False
        if is_VPS == False:
            print("NO")
        else:
            print("YES")