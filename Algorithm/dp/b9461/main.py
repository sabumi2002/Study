T= int(input())

sol = [0, 1, 1, 1, 2, 2]

for _ in range(T):
    n= int(input())
    sol = [0, 1, 1, 1, 2, 2]
    if n>5:
        for i in range(6, n+1):
            sol.append(sol[i-1]+sol[i-5])

    print(sol[n])