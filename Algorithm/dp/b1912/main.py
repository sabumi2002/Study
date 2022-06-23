n= int(input())
A= list(map(int, input().split()))
sol= [-1000, 0]

for i in range(n):
    if sol[1]<0:
        sol[1] = 0

    sol[1] += A[i]
    sol[0] = max(sol[0], sol[1])

print(sol[0])