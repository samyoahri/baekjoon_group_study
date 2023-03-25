def main():
    ## User Input
    N, M = input().split()
    N, M = int(N), int(M)

    J = int(input())
    apples = list()
    for _ in range(J):
        falling = int(input())
        apples.append(falling)

    step = 0
    L_location_basket = 1
    R_location_basket = M
    for i in apples:
        # 바구니 왼쪽에 사과
        if i < L_location_basket:
            distance = L_location_basket - i
            L_location_basket -= distance
            R_location_basket -= distance
            step += distance
        # 바구니 오른쪽에 사과
        elif i > R_location_basket:
            distance = i - R_location_basket
            L_location_basket += distance
            R_location_basket += distance
            step += distance
        else:
            continue

    print(step)

if __name__ == '__main__':
    main()