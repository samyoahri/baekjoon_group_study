from sys import stdin

def main():
    N = int(stdin.readline().strip())
    distance = list(map(int, stdin.readline().strip().split()))
    cost_city = list(map(int, stdin.readline().strip().split()))

    cost_min = cost_city[0]
    cost_total = 0

    for i in range(N-1):
        if cost_city[i] < cost_min:
            cost_min = cost_city[i]
        cost_total += cost_min * distance[i]
    
    print(cost_total)
        
if __name__ == "__main__":
    main()