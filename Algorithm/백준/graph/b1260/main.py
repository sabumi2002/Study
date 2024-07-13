from collections import deque


def dfs(graph, V, visited):
    visited[V] = True
    print(V, end=' ')
    for i in graph[V]:
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True

    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True




N, M, V = map(int, input().split())

graph = [[]]

for i in range(N):
    graph.append([])

for i in range(M):
    tmp = list(map(int, input().split()))
    graph[tmp[0]].append(tmp[1])
    graph[tmp[1]].append(tmp[0])

for i in range(N+1):
    graph[i].sort()

visited = [False] * (N+1)

dfs(graph, V, visited)

print()
visited = [False] * (N+1)
bfs(graph, V, visited)


