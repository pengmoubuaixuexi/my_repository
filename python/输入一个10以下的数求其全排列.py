#输入一个10以下的数看从0->n的全排列
def perm(word):
    result=[]
    if len(word)<=1:
        result.append(word)
        return result
    else:
        for i in range( len(word) ) :
            newword=word[ :i]+word[i+1:]
            newresult=perm(newword)
            for s in newresult:
                result.append(word[i]+s)
    return result
n=int(input())
s="".join([str(i) for i in range(1,n+1)])
for s1 in perm(s):
    print(s1)
# #%%
# s=["满意","不满意","满意","一般","非常好","不满意","满意","一般","非常好"]
# l = {"不满意":1,"满意":3,"一般":2,"非常好":4}
# l1=("不满意",1),("满意",3),("一般",2),("非常好",4)
# print(sorted(l.items(),key = lambda x: x[1]))
# print(sorted(l,key = lambda x: (l[x],l)))
# print(sorted(l1,key = lambda x: x[1]))
# # sorted()函数 输入的序列是什么输出来就是什么的列表形式
# #这里输入l是字典的key所以才只返回了key，相当于l.keys()
# #并不是看后面的lambda x : （）中x的判断条件来的，判断条件
# #只是排序而已