import numpy as np
import matplotlib.pyplot as plt
import random
a = np.arange(2,12)
b =[random.randint(1,10) for i in range(10)]
plt.bar(a,b)
plt.show()
plt.scatter(a,b)
plt.show()
b = [0,0,0,0,0,0,0,0,0,0.1]
Labels = "1","2","3","4","5","6","7","8","9","10"
plt.pie(a,explode = b,labels= Labels)
plt.show()