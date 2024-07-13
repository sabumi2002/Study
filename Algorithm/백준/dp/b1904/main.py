N = int(input())
dp = [1, 1]

for i in range(1, N):
    dp[0], dp[1] = dp[1], (dp[0]+dp[1])% 15746

print(dp[1])