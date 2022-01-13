def dfs(list, start, visited):
    if visited[start[0]][start[1]] == 1:
        return
    visited[start[0]][start[1]] = 1
    for i in direction:
        start[0] += i[0]
        start[1] += i[1]
        if start[0] < 0 or start[1] < 0 or start[0] >= N or start[1] >= M:
            start[0] -= i[0]
            start[1] -= i[1]
            continue

        dfs(list, start, visited)
        start[0] -= i[0]
        start[1] -= i[1]


    return 1


N, M = map(int, input().split())

list= []
for i in range(N):
    list.append([])
    frame = str(input())
    for x in frame:
        list[i].append(int(x))
print(list)

visited = list

direction = [[0, 1], [0, -1], [-1, 0], [1, 0]]
start=[0, 0]
result=0


# start[0] += direction[i][0]
# start[1] += direction[i][1]
for i in range(N):
    for j in range(M):
        start= [i, j]
        if dfs(list, start, visited) == 1:
            result +=1


print(visited)
print(result)



