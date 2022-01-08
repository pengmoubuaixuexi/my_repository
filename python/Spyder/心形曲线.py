import matplotlib.pyplot as plt
import numpy as np
x= np.array([i/100 for i in range(-100,101)])
y= np.sqrt(1-x*x)+np.power(x*x,1/3)
print(y)
y2 = -np.sqrt(1-x*x) +np.power(x*x,1/3)
print(y2)
plt.plot(x,y,"r,-",x,y2,"r,-")
plt.show()