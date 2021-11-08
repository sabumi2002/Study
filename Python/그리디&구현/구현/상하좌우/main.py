N= int(input())
move = list(map(str, input().split()))

def LRUD(x, y, a):
    if a=="L":
        if y == 1:
            return x, y
        else:
            y-=1
            return x, y

    elif a == "R":
        if y == N:
            return x, y
        else:
            y += 1
            return x, y

    elif a == "U":
        if x == 1:
            return x, y
        else:
            x -= 1
            return x, y

    elif a == "D":
        if x == N:
            return x, y
        else:
            x += 1
            return x, y

x, y = 1, 1
for i in move:
    x, y = LRUD(x, y, i)

print(x, y)


#######################
# 해설

