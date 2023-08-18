from sys import stdin

def main():
    T = int(stdin.readline().strip())
    result = list()

    for _ in range(T):
        J, N = list(map(int, stdin.readline().strip().split()))
        boxes = list()

        for _ in range(N):
            boxes.append(list(map(int, stdin.readline().strip().split())))
        boxes.sort(key = lambda x: -x[0]*x[1])

        num_box = 0
        for box in boxes:
            if J <= 0: 
                result.append(num_box)
                break
            J -= box[0] * box[1]
            num_box += 1

    for res in result:
        print(res)

if __name__ == "__main__":
    main()