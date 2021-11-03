s= input()
result=0
count=0
count_list=[]
for i in s:
    i=int(i)
    if i==0 or i==1:
        result+=i
    elif result==0:
        count+=1
        count_list.append(i)
        if count==2:
            result=count_list[0]*count_list[1]
    else:
        result*=i
print(result)


# 곱하기 혹은 더하기: 답안 예시

# data= input()
# # 첫 번째 문자를 숫자로 변경하여 대입
# result=int(data[0])
#
# for i in range(1, len(data)):
#     # 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
#     num = int(data[i])
#     if num <= 1 or result <=1:
#         result =+num
#     else:
#         result *= num
# print(result)