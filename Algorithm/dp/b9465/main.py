T = int(input())
A = [[], []]

for _ in range(T):
    n = int(input())
    dp = [[0 for _ in range(n+1)] for _ in range(2) ]
    A[0] = list(map(int, input().split()))
    A[1] = list(map(int, input().split()))

    for i in range(3, n+1):
        if A[0][i-3] > 0:
            A[]
