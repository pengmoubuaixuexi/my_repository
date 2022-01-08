import numpy as np
a = np.arange(30).reshape(2,3,5)
# print(a)
# print()
b = a.flatten()
# print(b)
# numpy中关于线性代数的库linalg
# print(a.dot(a1))#3x4 4x3 ==3x3
c =  np.array([[3,4,2],[1,3,5],[2,3,6]])
# print(np.linalg.det(c))#求行列式
# print()
# print(np.linalg.inv(c))#求nxn的逆矩阵
# print()
# print(np.linalg.pinv(a))#求nxm的逆矩阵
# print(np.linalg.eig(c))#求特征值和特征向量返回组成的元组
# a,b = np.linalg.eig(c)
# print(a)
# print(b)
# print(np.random.rand(3,4))
b1 = np.array([[ 0 ,1  ,2,  3,  4],
 [ 5,  6,  7,  8,  9],
 [10, 11, 19, 13, 14],
 [15, 16, 131, 18, 19]])
print(b1)
# np.savetxt("b1.dat",b1,fmt = "%d")
#np.save("b1.npy",b1)
b1.tofile("b1.dat",format = "%d")
# b1 = np.loadtxt("b2.txt",dtype = np.int32)
# b1 = np.load("b1.txt")
b2 = np.fromfile("b1.dat",dtype = np.int32).reshape(4,5)
print(b2)