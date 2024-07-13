n= int(input())

sol=[0, 1]

for i in range(2, n+1):
    sol.append(sol[i-1] + sol[i-2])

print(sol[n])