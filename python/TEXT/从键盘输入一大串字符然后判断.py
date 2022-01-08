import sys
str = sys.stdin.read()
for j in set(i for i in str if i.isalnum()==False and i!=' '):
    str=str.replace(j,' ')
str = str.rstrip(' ').lower().split()
str1=dict()
for i in str:
    i=i[:15]
    if i not in str1:
        str1[i]=1
    else:
        str1[i]+=1
str1=sorted(str1.items(),key = lambda x:(x[1],x[0]))
print(len(str1))
print(str1)
del(str)
for i in range(0,int(0.1*len(str1))):
    print(str1[i][0]+':'+str(str1[i][1]))