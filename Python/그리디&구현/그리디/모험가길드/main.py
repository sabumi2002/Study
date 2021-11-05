n= input()
k=list(map(int, input().split()))
k.sort()
result=0

for i in k:
    if i<=1:
        result+=1
        k.remove(i)
    else:
        count = 0
        for j in k:
            if count==i:
                for _ in range(count):
                    k.pop(0)
                result+=1
            if j<=i:
                count+=1

print(f'result= {result}')

# 해답
# n = int(input())
# data = list(map(int, input().split()))
# data.sort()
#
# result = 0
# count = 0
# for i in data:
#     count += 1
#     if count >= i:
#         result += 1
#         count = 0
#
# print(result)