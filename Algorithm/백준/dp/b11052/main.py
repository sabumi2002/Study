N = int(input())
P = list(map(int, input().split()))
dp =[]
max1 = 0
for i in range(len(P)):
    max1 = P[i]
    dp.append(max1)
    if i>0:
        for j in range(i):
            max1 = max(max1, dp[i-1-j] + P[j])
        dp[i] = max1

print(dp[N-1])