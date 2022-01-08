#sorted 用法
# a=[("彭涛",100,18),("黄河晓",90,19),("王健",80,20,999)]
# b=sorted(a,key=lambda s:s[2],reverse = True)
# print(b)

#map 用法
# 一
# def f(x):
#     x=x+10
#     return x
# a=[1,2,3,4]
# b=list(map(f,a))
# print(b)
# 二
# names1=['adam', 'LISA', 'barT']
# def format_name(s):
#     s2=s[0:1].upper()+s[1:].lower()
#     return s2
# names2=map(format_name,names1)
# print(list(names2))

# zip()
# print(list(zip([1,2,3,4],{3,4,5},"6789",(9,18,123,421))))
# print(dict(zip([1,2,3,4],["彭涛","黄河晓","唐玉杰","王健"])))

#any() and all()
# print(any([[],1]))#序列中有一个是True就是True
# print(all([0,1,'Ture']))#列表中只有全是True才是True

# 引入其他文件中的函数
#一
# import first
# first.f()
#二
# from first import *
# f()

# import sys
# print(sys.argv[0])
# print(sys.argv[1])
# print(sys.argv[2])
# print(int(sys.argv[1])*int(sys.argv[2]))
