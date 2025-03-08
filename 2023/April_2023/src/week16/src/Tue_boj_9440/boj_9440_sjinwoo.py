import sys

def main():
    # 사용자 입력
    result = []
    while True:
        N = sys.stdin.readline()
        if N[0] == '0': break
        nums = sorted(N.split()[1:])
    
        num1, num2 = str(), str()

        # 0 이 아닌 제일 작은 숫자를 맨 앞자리에 넣고, 넣은 숫자를 제외함.
        for i in range(len(nums)):
            if nums[i] != '0':
                num1, num2 = nums[i], nums[i+1]
                nums.remove(num1)
                nums.remove(num2)
                break
        for i in range(0, len(nums), 2): 
            num1 += nums[i]
            if i < len(nums) - 1:
                num2 += nums[i+1]

        result.append(int(num1) + int(num2))
    return result

if __name__ == '__main__':
    for res in main(): print(res)