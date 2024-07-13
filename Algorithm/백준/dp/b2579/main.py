
N= int(input())
score = []
dp = []
for i in range(N):
    score.append(int(input()))


dp.append(score[0])
if N>1:
    dp.append(score[0]+score[1])
    if N>2:
        dp.append(max(score[1]+score[2], score[0]+score[2]))
        for i in range(3, N):
            dp.append(max(dp[i-3]+score[i-1]+score[i], dp[i-2]+score[i]))

print(dp[N-1])
