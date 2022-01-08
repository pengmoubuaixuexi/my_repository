import random
a = [random.randint(0,100) for i in range(20)]
print(a)
b = sorted(a[:10])
print(b)
c = sorted(a[10:20],key = lambda x:-x)
print(c)
#%%删除员工信息
lst = [["李玉","男",25],["金忠","男",23],["刘妍","女",21],["莫心","女",24],["沈冲","男",28]]
while 1:
    delname = input("请输入要删除员工的名字\n")
    if delname == '0':
        break
    for i in range(len(lst)):
        if lst[i][0] == delname:
            del lst[i]
            print(lst)
            break
    else:
        print("没有这个员工的信息")
#%%统计人员去过的城市及去过某城市的人有谁
dict1 = {"张三丰":["北京","成都"],"李芙蓉":["广州","上海","兰州"],"慕容复":["太原","西安","上海","济南"]}
for i in dict1:
    print(f"{i}去过了{len(dict1[i])}个城市")
print("去过上海的人有")
for i in dict1:
    for j in dict1[i]:
        if j == "上海":
            print(i,end=" ")
#%%一个字典放各个班的类型，另一个字典放各个类型的人数，统计各班人数及全园人数
d1={"托班":["a","b","c"],"小班":["d","e"],"中班":["f","g"],"大班":["h","i"]}
d2 = {"a":26,"b":23,"c":25,"d":32,"e":31,"f":33,"g":34,"h":32,"i":33}
d3 = {}
for i in d1:
    for j in d1[i]:
        d3[i] = d3.get(i,0)+d2[j]
sum = 0
for i in d3:
    print(f"{i} : {d3[i]}")
    sum = sum+d3[i]
print(f"全园总过{sum}人")
#%%利用有账号密码，做一个登陆
dit = {"John":"123","Merry":"111","Tommy":"123456"}
admin = input("请输入账号\n")
if admin in dit.keys():
    password = input("请输入密码\n")
    if dit[admin] == password:
        print("成功登陆")
    else:
        print("密码错误")
else:
    print("账号错误")
#%%根据员工名单补齐员工年终奖，没有在dit中的都是5000元
yuangong = ["李梅","张富","付妍","赵诺","刘江"]
dit = {"张富":10000,"赵诺":15000}
for i in yuangong:
    dit[i] = dit.get(i,5000)
    print(f"{i}:{dit[i]}元")
#%%
dic_student = {}
for i in range(1,6):
    nameAndEge = input(f"请输入第{i}位同学的姓名和年龄以空格划分\n").split()
    dic_student[nameAndEge[0]] = nameAndEge[1]
for i,j in dic_student.items():
    print(f"{i}",f"{j}".rjust(20-2*len(i)-len(j)))
 