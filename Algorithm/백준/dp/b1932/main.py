n = int(input())
triangle = []
for i in range(n):
    triangle.append(list(map(int, input().split())))
    if i==0: continue
    for j in range(len(triangle[i])):
        if j==0:
            triangle[i][j] += triangle[i-1][j]
            continue
        if i==j:
            triangle[i][j] += triangle[i - 1][j-1]
            continue

        triangle[i][j] += max(triangle[i-1][j-1], triangle[i-1][j])

print(max(triangle[n-1]))