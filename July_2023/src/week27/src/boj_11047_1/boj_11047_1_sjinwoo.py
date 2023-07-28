def main():
    N, K = map(int, input().split())
    value_coins = list()
    result = 0

    for _ in range(N):
        value = int(input())
        value_coins.append(value)
    
    
    for i in range(N-1, -1, -1):
        if K == 0: break
        result += K // value_coins[i]
        K = K % value_coins[i]

    print(result)


if __name__ == "__main__":
    main()