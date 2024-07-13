N ,K= map(int, input().split())
dp = [[0 for _ in range(K + 1)] for _ in range(N + 1)]
stuff = [[0, 0]]
for i in range(N):
    stuff.append(list(map(int, input().split())))

for i in range(1, N+1):
    weight = stuff[i][0]
    value = stuff[i][1]
    for j in range(1, K+1):
        if j < weight:
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i-1][j-weight]+value, dp[i-1][j])

print(dp[N][K])