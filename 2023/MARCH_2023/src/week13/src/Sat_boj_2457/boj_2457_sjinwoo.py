import sys

def main():
    # 사용자 입력
    N = int(sys.stdin.readline())
    flowers = []
    for _ in range(N):
        start_month, start_day, end_month, end_day = map(int, sys.stdin.readline().split())
        flowers.append([start_month*100 + start_day, end_month*100 + end_day])
    
    # 피는 날짜를 기준으로 정렬, 같으면 지는 날짜가 빠른 순
    flowers.sort(key = lambda lst: (lst[0], lst[1]))
    end_date = 301
    num_flower = 0

    # 모든 꽃을 순회하면 종료
    while flowers != []:
        # 조건을 만족하거나, 기간에 공백이 생기면 종료
        if end_date > 1130 or flowers[0][0] > end_date: break

        # 시작 날짜가 현재 마지막 날짜보다 작은 것 중에 지는 날짜가 가장 늦는 것을 선택
        selected = []
        for _ in range(len(flowers)):
            if flowers[0][0] <= end_date:
                selected.append(flowers.pop(0))
            else: break

        selected.sort(key = lambda lst: -lst[1])

        # 마지막 날짜를 수정하고, 카운트 + 1
        end_date = selected[0][1]
        num_flower += 1

    return num_flower if end_date > 1130 else 0

if __name__ == '__main__':
    print(main())