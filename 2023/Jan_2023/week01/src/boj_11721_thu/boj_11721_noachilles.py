if __name__ == '__main__':
    word = input()
    for i in range(0, len(word), 10):
        print(word[i:i+10])