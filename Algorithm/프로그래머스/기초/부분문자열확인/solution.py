# My Solution
def solution(my_string, target):
    answer = 1 if my_string.find(target) >= 0 else 0
    return answer

# Best Solution
def solution(my_string, target):
    return int(target in my_string)


# import sys
# my_string = str(sys.stdin.readline())
# target = str(sys.stdin.readline())
