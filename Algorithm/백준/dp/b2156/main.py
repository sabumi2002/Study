n= int(input())

A= [0]
sol= [0]
for _ in range(n):
    A.append(int(input()))

sol.append(A[1])

if n > 1:
    sol.append(A[1] + A[2])

for i in range(3, n+1):
    sol.append(max(sol[i-3]+A[i-1]+A[i], sol[i-2]+A[i], sol[i-1]))

print(sol[n])