n= int(input())

sol = [0, 1, 3]

for i in range(3, n+1):
    sol.append(sol[i-1]+ sol[i-2]*2)

print(sol[n]%10007)