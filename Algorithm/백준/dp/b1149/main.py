N= int(input())

sumRoad = [0, 0, 0]

for i in range(N):

    road = list(map(int, input().split()))
    minList = sumRoad.copy()
    minList.sort()
    for j in range(3):
        if minList[0]==sumRoad[j]:
            road[j-1] += minList[0]
            road[j-2] += minList[0]
            road[j] += minList[1]
            break
    sumRoad = road.copy()

print(min(sumRoad))
