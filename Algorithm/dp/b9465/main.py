T = int(input())
A = [[0], [0]]

for _ in range(T):
    n = int(input())
    dp = [[0 for _ in range(n+1)] for _ in range(2) ]
    A[0] += list(map(int, input().split()))
    A[1] += list(map(int, input().split()))

    if A[0][1]+A[1][2] > A[1][1]+A[0][2]:
        dp[0][1], dp[1][2] = A[0][1], A[1][2]
    else:
        dp[1][1], dp[0][2] = A[1][1], A[0][2]

    for i in range(3, n+1):
        max1 = A[1][i - 2]+A[0][i - 1]+A[1][i]
        max2 = A[1][i - 2]+A[0][i]
        max3 = A[0][i - 2]+A[1][i - 1]+A[0][i]
        max4 = A[0][i - 2]+A[1][i]
        if dp[0][i-3] > 0:
            if max1 > max2:
                dp[1][i-2], dp[0][i-1], dp[1][i] = A[1][i-2], A[0][i-1], A[1][i]
                dp[0][i-2], dp[1][i-1], dp[0][i] = 0, 0, 0
            else:
                dp[1][i - 2], dp[0][i] = A[1][i - 2], A[0][i]
                dp[0][i - 2], dp[1][i], dp[0][i-1], dp[1][i-1] = 0, 0, 0, 0
        elif dp[1][i-3] > 0:
            if max3 > max4:
                dp[0][i - 2], dp[1][i - 1], dp[0][i] = A[0][i - 2], A[1][i - 1], A[0][i]
                dp[1][i - 2], dp[0][i - 1], dp[1][i] = 0, 0, 0
            else:
                dp[0][i - 2], dp[1][i] = A[0][i - 2], A[1][i]
                dp[1][i - 2], dp[0][i], dp[0][i-1], dp[1][i-1] = 0, 0, 0, 0
        else:
            maxSum = max(max1, max2, max3, max4)
            if maxSum == max1:
                dp[1][i - 2], dp[0][i - 1], dp[1][i] = A[1][i - 2], A[0][i - 1], A[1][i]
                dp[0][i - 2], dp[1][i - 1], dp[0][i] = 0, 0, 0
            elif maxSum == max1:
                dp[1][i - 2], dp[0][i] = A[1][i - 2], A[0][i]
                dp[0][i - 2], dp[1][i], dp[0][i-1], dp[1][i-1] = 0, 0, 0, 0
            elif maxSum == max1:
                dp[0][i - 2], dp[1][i - 1], dp[0][i] = A[0][i - 2], A[1][i - 1], A[0][i]
                dp[1][i - 2], dp[0][i - 1], dp[1][i] = 0, 0, 0
            elif maxSum == max1:
                dp[0][i - 2], dp[1][i] = A[0][i - 2], A[1][i]
                dp[1][i - 2], dp[0][i], dp[0][i-1], dp[1][i-1] = 0, 0, 0, 0

    print(dp)