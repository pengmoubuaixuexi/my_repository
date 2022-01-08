# m=int(input("请输入一个正整数:"))
# n=int(input("请输入一个正整数:"))
# g=1
# while 1:
#     if m>n:
#         (m,n)=(n,m)
#     g=n%m
#     if g==0:
#          break
#     n=m
#     m=g
# print("最大公约数为:",m)
#%%
a=[[1,7,4,1],
[4,8,3,6],
[1,6,1,2],
[0,7,8,9]]
row = []
dian = []
for i in range(4):
    maxrow = -1;
    for j in range(4):
        if a[i][j] > maxrow:
            maxrow = a[i][j]
    row.append(maxrow)
for i in range(4):
    for j in range(4):
        if a[i][j] == row[i]:
            for k in range(4):
                if a[k][j] < row[i]:
                    break
            else:
                dian.append((i,j))
if len(dian) == 0:
    print("none")
else:
    print(dian)