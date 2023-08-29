from sys import stdin

def main():
    N = int(stdin.readline().strip())
    skill = stdin.readline().strip()

    stack_LR = list()
    stack_SK = list()
    num_skill = 0

    for tech in skill:
        if tech in "123456789":
            num_skill += 1

        elif tech == 'L':
            stack_LR.append(tech)

        elif tech == 'R':
            if stack_LR == []: 
                break
            else: 
                num_skill += 1
                stack_LR.pop()

        elif tech == 'S':
            stack_SK.append(tech)

        elif tech == 'K':
            if stack_SK == []: 
                break
            else: 
                num_skill += 1
                stack_SK.pop()
            
        else: break

    print(num_skill)

if __name__ == "__main__":
    main()