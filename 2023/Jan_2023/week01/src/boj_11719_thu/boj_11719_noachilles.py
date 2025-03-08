import sys
import re

if __name__ == '__main__':
    str = []
    for line in sys.stdin:
        edit_line = re.sub(r'[^\w\s]', '', line)
        str.append(edit_line)
    join_str = ''.join(str)
    print(join_str)