a = eval(input("请输入第一个数"))
b = eval(input("请输入第二个数"))
c = eval(input("请输入第三个数"))
print("输入了{} {} {}".format(a,b,c))
if a<=b:
    a,b = b,a
if a<=c:
    a,c = c,a
if b<=c:
    b,c = c,b
print("{}>{}>{}".format(a,b,c))
#%%
s=0
for i in range(100,1000):
    if i%2 != 0:
        s = s+i
        print(i,end=" ")
    if i%20 == 0:
        print()
print(s)
i=100
s=0
while i<1000:
    if i%2 !=0:
        s=s+i
        print(i,end=" ")
    if i%20 ==0:
        print()
    i+=1
print(s)
#%%
s=0
for i in range(0,64):
    s=2**i+s
print(s)
print("共重{}吨".format(s*50/10**6))