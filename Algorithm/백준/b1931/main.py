n = int(input())
rooms = []
for i in range(n):
    rooms.append(tuple(map(int, input().split())))

rooms = sorted(rooms, key=(lambda x: (x[1], x[0])))

end_time = 0
count = 0
for room in rooms:
    if end_time <= room[0]:
        count += 1
        end_time = room[1]

print(count)
