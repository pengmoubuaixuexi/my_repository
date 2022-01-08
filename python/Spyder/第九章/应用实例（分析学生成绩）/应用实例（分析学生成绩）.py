import matplotlib.pyplot as plt
import numpy as np
import matplotlib
import csv
a = np.array(["彭涛"])
matplotlib.rcParams["font.family"] = "SimHei"
with open("score.csv","r") as data:
    reader = csv.reader(data)
    next(reader)
    b=[]
    c=[]
    for i in reader:
        c.append(i[0])
        del i[0]
        b.append(i)
data = np.array(b).astype(float)
print(data)
# data = np.loadtxt("score.csv",delimiter=",",skiprows= 1)
stuScore = np.sum(data,axis = 1)
stuAvgScore = np.average(data[:,:],axis = 0)
stuMaxScore = np.max(data[:,:],axis = 0)
stuMinScore = np.min(data[:,:],axis = 0)
print("每个同学的三门课程总分：")
for i in range(len(data)):
    print(c[i] + "的总分："+ "{:.2f}".format(stuScore[i]),end = "  ")
    if (i+1)%3 == 0:
        print()
print("所有学生的每门课程的平均分：")
print("数学分析：{:.2f}，C语言程序设计：{:.2f}，Python数据分析：{:.2f}".format(stuAvgScore[0],stuAvgScore[1],stuAvgScore[2]) )
print("每门课程的最高分为：")
d = ["数学分析","C语言程序设计","Python数据分析"]
for i in range(3):
    for j in range(len(c)):
        if data[j,i] == stuMaxScore[i]:
            print("{}的最高分为{}的{}分".format(d[i],c[j],stuMaxScore[i]))#C数组代表同学的名字，通过位置索引和分数串联起来
for i in range(3):
    for j in range(len(data)):
        if data[j,i] == stuMinScore[i]:
            print("{}的最低分为{}的{}分".format(d[i],c[j],stuMinScore[i]))#C数组代表同学的名字，通过位置索引和分数串联起来
plt.title("课程成绩分布直方图")
#first
plt.subplot(311)
plt.hist(data[:,0],bins = 10,range = (0,100),color = "red")
plt.xlabel("高数成绩分段图")
plt.ylabel("人数")
plt.xticks([10*i for i in range(11)])
plt.yticks([2*i for i in range(11)])
plt.grid()
#second
plt.subplot(312)
plt.hist(data[:,1],bins = 10,range = (0,100),color = "green")
plt.xlabel("C语言程序设计成绩分段图")
plt.ylabel("人数")
plt.xticks([10*i for i in range(11)])
plt.yticks([2*i for i in range(11)])
plt.grid()
#third
plt.subplot(313)
plt.hist(data[:,2],bins = 10,range = (0,100),color = "blue")
plt.xlabel("Python数据分析成绩分段图")
plt.ylabel("人数")
plt.xticks([10*i for i in range(11)])
plt.yticks([2*i for i in range(11)])
plt.grid()
plt.show()