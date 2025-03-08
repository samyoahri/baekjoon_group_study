def main():
    N = int(input())
    num_of_bag = 0

    # N이 5의 배수이면 바로 return
    if N % 5 == 0: 
        return N // 5
    else:
        # 5kg을 최대로 써야하니, 3kg을 1개씩 빼면서 계산
        while N > 0:
            N -= 3
            num_of_bag += 1
            # 3kg 개수를 늘려가면서 N이 0이되거나 5의 배수가 되면 return
            if N % 5 == 0 or N == 0: 
                num_of_bag += (N // 5)
                return num_of_bag
            # N이 1, 2가 남을 경우 3, 5kg의 조합으로 불가능
            elif N == 1 or N == 2:
                return -1
    

if __name__ == '__main__':
    print(main())