import numpy as np
f = np.poly1d([1,0,2,0,0,1])
print("f(2)="+str(f(2))+"  f(5)="+str(f(5)))
print(np.polyder(f))
print(np.polyder(f,2))
#%%
import math
import matplotlib.pyplot as plt
# plt.axis("auto")
x= np.linspace(0,2*math.pi,100)
# x = [ i/100 for i in range(0,round(200*math.pi))]
plt.title("f(x)=sin(x)+x*x")
y = np.sin(x) + x*x
plt.xticks(np.linspace(0,round(2*math.pi,2),6))
plt.plot(x,y,"r,-")
plt.show()
#%%
import numpy as np
import matplotlib.pyplot as plt
import matplotlib
matplotlib.rcParams["font.family"] = "SimHei"
matplotlib.rcParams["axes.unicode_minus"]=False
f = np.poly1d([1,2,3,4])
g = np.polyder(f)
h = np.polyder(f,2)
x = np.linspace(-10,10,20)
f1 = f(x)
g1 = g(x)
h1 = h(x)
plt.subplots_adjust(hspace = 0.8)#调整上下子图间距
plt.subplot(3,1,1)
plt.plot(x,f1,"r,-")
plt.title("Polynomial")
plt.subplot(3,1,2)
plt.title("First Derivative")
plt.plot(x,g1,"b,:")
plt.subplot(3,1,3)
plt.title("Second Derivative")
plt.plot(x,h1,"go-")
plt.show()
#%%
