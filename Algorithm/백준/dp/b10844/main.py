N= int(input())

sol = [[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]]
result = 0


for i in range(N):
    sol.append([])
    for j in range(10):
        if j==0:
            sol[i+1].append(sol[i][1])
        elif j==9:
            sol[i+1].append(sol[i][8])
        else:
            sol[i+1].append(sol[i][j-1] + sol[i][j+1])

result = sum(sol[N-1])

print(result%1000000000)
