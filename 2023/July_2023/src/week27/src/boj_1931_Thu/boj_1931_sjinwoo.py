from sys import stdin

def main():
    K = int(stdin.readline().strip())
    schedule = []
    result = []

    for _ in range(K):
        schedule.append(list(map(int, stdin.readline().strip().split())))
    schedule.sort(key = lambda x: (x[1], x[0]))

    for meeting in schedule:
        if result == []: result.append(meeting)
        elif result[-1][1] <= meeting[0]: result.append(meeting)

    print(len(result))
    

if __name__ == "__main__":
    main()