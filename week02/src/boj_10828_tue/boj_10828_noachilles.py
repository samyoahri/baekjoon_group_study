import sys
input = sys.stdin.readline

class stack:
    def __init__(self):
        self.st = []
    def push(self, X):
        self.st.append(X)
    def pop(self):
        if self.empty():
            return -1
        else:
            return self.st.pop()
    def size(self):
        return len(self.st)
    def empty(self):
        if self.st == []:
            return 1 
        else:
            return 0
    def top(self):
        if self.empty():
            return -1
        else:
            return self.st[-1]

if __name__ == "__main__":
    N = int(input().strip())
    main_stk = stack()
    for line in range(N):
        comd = input().strip()
        if "push" in comd:
            comd, x = comd.split()
            x = int(x)
            main_stk.push(x)
        elif comd == "pop":
            print(main_stk.pop())
        elif comd == "size":
            print(main_stk.size())
        elif comd == "empty":
            print(main_stk.empty())
        elif comd == "top":
            print(main_stk.top())
        else:
            print("It is not available command.")
        