from sys import stdin

def main():
    T = int(stdin.readline().rstrip())
    pair_bit = list()
    result = list()

    for _ in range(T):
        pair_bit.append(stdin.readline().rstrip().split())

    for bits in pair_bit:
        diff_1, diff_2 = 0, 0
        for idx in range(len(bits[0])):
            if bits[0][idx] != bits[1][idx]:
                if bits[1][idx] == '1':
                    diff_1 += 1
                else: diff_2 += 1
        result.append(max(diff_1, diff_2))

    for res in result: print(res)

if __name__ == "__main__":
    main()