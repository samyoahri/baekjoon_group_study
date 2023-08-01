from sys import stdin

def main():
    string = stdin.readline().strip().split('-')
    result = sum(list(map(int, string[0].split('+'))))

    for sub_string in string[1:]:
        result -= sum(list(map(int, sub_string.split('+'))))
    
    print(result)
        
if __name__ == "__main__":
    main()