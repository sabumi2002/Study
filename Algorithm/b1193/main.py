n= int(input())
list=[1]
a=2

while list[list.__len__()-1]<n:
    list.append(a+list[list.__len__()-1])
    a+= 1

count= list[list.__len__()-1]-n

print(list)

if list.__len__()%2==0:
    i = list.__len__()
    j = 1
    i-=count
    j+=count
    print(f'{i}/{j}')
else:
    i = 1
    j = list.__len__()
    i += count
    j -= count
    print(f'{i}/{j}')
