s=input()
find = input()
cnt=0
for str in s:
    if str == find:
        cnt+=1
print(cnt,end='')