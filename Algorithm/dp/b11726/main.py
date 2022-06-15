# def sol(n):
#     if n == 1:
#         return 1
#     elif n == 2:
#         return 2
#     else:
#         return sol(n-1) + sol(n-2)

def sol(n):
    if n == 1: return 1
    if n == 2: return 2
    first = 1
    second = 2
    for _ in range(n-2):
        first, second = second, first + second
    return second

n = int(input())

print(sol(n)%10007)
