from sys import stdin

def main():
    S = stdin.readline().strip().replace('>', '<').split('<')
    result = str()

    for idx in range(len(S)):
        if S[idx] == '':
            continue
        elif S[idx-1] == '' or S[idx+1] == '':
            result += '<' + S[idx] + '>'
        else:
            words = [word[::-1] for word in S[idx].split()]
            result += " ".join(words)

    print(result)

if __name__ == "__main__":
    main()