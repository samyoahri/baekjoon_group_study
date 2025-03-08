from sys import stdin

def main():
    S = int(stdin.readline().strip())
    sigma = 0
    num_NN = 0
    while True:
        # 1부터 K까지의 합이 S보다 크면, K-1 개의 자연수의 합으로 S를 만들 수 있음.
        # S = 14 일 때, 
        # 1 + 2 + 3 + 4 + 5 = 15 에서 2 + 3 + 4 + 5 = 14 로 만들 수 있음.
        num_NN += 1
        sigma += num_NN
        
        if sigma > S: break

    print(num_NN - 1)

if __name__ == "__main__":
    main()