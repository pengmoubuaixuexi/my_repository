import numpy as np
import matplotlib
import matplotlib.pyplot as plt
matplotlib.rcParams["font.family"] = "SimHei"
matplotlib.rcParams["axes.unicode_minus"] = False
x = np.linspace(0,10,100)
y = np.sin(x)
plt.plot(x,y)
f1 = plt.figure(1)
plt.title("正弦图",loc = "center")
plt.xlabel("x标签")
plt.ylabel("y标签")
plt.text(4/3*np.pi,0.6,"我是图文字")
plt.ylim(-1.5,1.5)
plt.legend(["我是图例1","我是图例2"])
a = plt.axis()
print(a)
# x_ticket,table = plt.xticks()
# print(x_ticket)
# print(table)
a,b =plt.xticks([i for i in range(11)])#,["a","b","c","d","e","f","g","h","i","j","k"])
print(a)
print(b)
# print(plt.xlim())
plt.show()
#%%
x = np.arange(10)
y = x
y1 = 2*x
y2 = 3*x
plt.plot (x,y,"rs-",x,y1,"ro-",x,y2,"r*:")
plt.legend(["y=x","y=2x","y=3x"])
a= plt.axis()
print(a)
plt.show()

#%%网上复制的一份用于理解
import matplotlib.pyplot as plt
f1=plt.figure()
plt.title("figure1")


f2=plt.figure(2)
plt.title("figure2")
plt.subplot(221)#第一个2是两个，第二个是占1/2列，第三个是用这个方法划分第一个
plt.ylabel( "s1")
plt.subplot(212)
plt.ylabel( "s2")


f3=plt.figure(5)
plt.title("figure5")

f6=plt.figure(6,(4,4),100)
plt.title("figure6")

f7=plt.figure(7,None,None,'#FFD700','#FF0000')
plt.title("figure7")
plt.show()
#%%
