def main():
    K = int(input())
    result = []

    for _ in range(K):
        current = int(input())
        if current == 0: 
            result.pop()
        else:
            result.append(current)

    print(sum(result))

if __name__ == "__main__":
    main()