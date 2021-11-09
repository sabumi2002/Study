# def LRUD(x, y):
#     count = 0
#     if 0 < (x - 2):
#         if 0 < (y - 1):
#             count += 1
#         if 9 > (y + 1):
#             count += 1
#
#     if 0 < (y - 2):
#         if 0 < (x - 1):
#             count += 1
#         if 9 > (x + 1):
#             count += 1
#
#     if 9 > (y + 2):
#         if 0 < (x - 1):
#             count += 1
#         if 9 > (x + 1):
#             count += 1
#
#     if 9 > (x + 2):
#         if 0 < (y - 1):
#             count += 1
#         if 9 > (y + 1):
#             count += 1
#     return count
#
# column = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
#
# answer = input()
# col=0
# row= int(answer[1])
#
# for i in column:
#     col += 1
#     if answer[0] == i:
#         break
#
# result = LRUD(row, col)
# print(result)


#######################################
# 해설

# 현재 나이트의 위치 입력받기
input_data = input()
row = int(input_data[1])
column = int(ord(input_data[0])) - int(ord('a'))+1

# 나이트가 이동할 수 있는 8가지 방향 정의
steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

# 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
result =0
for step in steps:
    # 이동하고자 하는 위치 확인
    next_row = row + step[0]
    next_column = column + step[1]
    # 해당 위치로 이동이 가능하다면 카운트 증가
    if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <=8:
        result += 1

print(result)




