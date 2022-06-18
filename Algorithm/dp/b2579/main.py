
N= int(input())
score = []
dp = []
for i in range(N):
    score.append(int(input()))
    dp.append('0')

if N==0:
    score.append('0')
    dp.append('0')

dp[0] = score[0]
dp[1] = score[0]+score[1]
dp[2] = max(score[1]+score[2], score[0]+score[2])
for i in range(3, N):
    dp[i] = max(dp[i-3]+score[i-1]+score[i], dp[i-2]+score[i])

print(dp[N-1])
