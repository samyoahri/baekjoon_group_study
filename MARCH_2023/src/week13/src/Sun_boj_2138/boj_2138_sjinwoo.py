import sys

def boj_2138() -> int:
    # 사용자 입력, 제로 패딩
    N = int(sys.stdin.readline())
    present = '0' + sys.stdin.readline() + '0'
    target = '0' + sys.stdin.readline() + '0'
    # 스위치 카운터
    switch = 0
    # 변환 테이블
    table = str.maketrans('01', '10')

    # 하나씩 모두 순회
    for i in range(1, N+1):
        # 현재 부분 문자열
        sub_str = present[i-1:i+2]
        if target == present: break
        # i-1번째가 다르면 무조건 누름
        elif target[i-1] != present[i-1]:
            switch += 1
            present = present.replace(sub_str, sub_str.translate(table))
        # i번째는 같지만 i+1번째가 다를 경우, 누름
        elif target[i] == present[i] and target[i+1] != present[i+1]:
            switch += 1
            present = present.replace(sub_str, sub_str.translate(table))

    return switch

if __name__ == "__main__":
    result = boj_2138()
    print(result)

