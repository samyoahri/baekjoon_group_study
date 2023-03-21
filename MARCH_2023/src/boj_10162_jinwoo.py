def main():
    A, B, C = 300, 60, 10
    T = int(input())
    result_A = divmod(T, A)
    result_B = divmod(result_A[1], B)
    result_C = divmod(result_B[1], C)
    if result_C[1] != 0: 
        print("-1")
    else:
        print(result_A[0], result_B[0], result_C[0])
    return

if __name__ == '__main__':
    main()