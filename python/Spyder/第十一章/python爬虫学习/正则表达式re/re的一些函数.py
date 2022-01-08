import re
#%%findall  返回列表
lst = re.findall("\d+","0201086,pt 0201085")
print(lst)
#%%finditer  返回迭代器
it = re.finditer("\d+","0201086 pt 0201085")
for i in it:
    print(i.group())
#%%search  全文匹配返回第一个匹配的
search = re.search("\d+","0201086 pt 0201085")
print(search)
#%%match  从头开始匹配返回第一个
search = re.match("\d+","a0201086 pt 0201085")
print(search)
#%%预加载 类似C语言中的define
obj = re.compile("\d+")
search = obj.match("0201086 pt 0201085")
print(search)
#%%(?P<分组名字（自定义）>正则) 从正则表达式中进一步筛选东西