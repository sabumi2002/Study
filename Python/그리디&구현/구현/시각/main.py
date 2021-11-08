import time
N = int(input())
start_time = time.time()
list= [3, 13, 23]

count=0

for i in range(0, N+1):
    if i==3 or i==13 or i==23:
        count = count+(60*60)
        continue
    count = count+((15*60)+(15*60)-(15*15))

print(count)


end_time=time.time()
print(f"time: {end_time-start_time}")

##############
# 해결
#
# import time
#
# h= int(input())
# start_time = time.time()
#
# count=0
# for i in range(h+1):
#     for j in range(60):
#         for k in range(60):
#             if '3' in str(i)+str(j)+str(k):
#                 count +=1
# print(count)
#
#
# end_time=time.time()
# print(f"time: {end_time-start_time}")
