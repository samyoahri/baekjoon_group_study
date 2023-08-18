from sys import stdin
from itertools import combinations

def main():
    expression = stdin.readline().strip()

    stack = list()
    pair_index = list()
    answer = list()

    for idx, char in enumerate(expression):
        if char == '(':
            stack.append(idx)
        elif char == ')':
            pair_index.append([stack.pop(), idx])

    for i in range(1, len(pair_index)+1):
        combi = list(combinations(pair_index, i))
        
        for pair in combi:
            result = list(expression)
            for bracket in pair:
                result[bracket[0]] = ''
                result[bracket[1]] = ''   
            answer.append("".join(result))

    answer = sorted(list(set(answer)))
    for i in range(len(answer)):
        print(answer[i])
        

if __name__ == "__main__":
    main()