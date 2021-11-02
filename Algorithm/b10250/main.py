T = int(input())
for i in range(T):
    H, W, N = map(int, input().split())
    x = N // H + 1
    y = N % H
    if N % H == 0:
        x = N//H
        y = H
    print(f'{y*100+x}')