from plotly.offline import plot
import plotly.graph_objs as go
import pandas as pd
data = pd.read_csv("score.csv",encoding="GBK")
data["总评成绩"]=data["笔试"]*0.5+data["平时"]*0.25+data["实验"]*0.25
xdata=data["姓名"].tolist() #取姓名这一列，变列表
ydata1=data["总评成绩"].tolist() #取总评成绩这一列，变列表
ydata2=data["笔试"].tolist() #取笔试成绩这一 -列， 变列表
ydata3=data["实验"].tolist()
trace0=go.Scatter(x=xdata,y=ydata1 ,name="总评成绩") #总评折线
trace1=go.Scatter(x=xdata,y=ydata2,name="笔试成绩") #笔试折线
trace2=go.Scatter(x=xdata,y=ydata3,name="实验成绩")
mylayout=go.Layout(title="总评成绩和笔试成绩相关图",barmode="stack") #图的标题
fig=go.Figure(data=[trace0, trace1,trace2] ,layout=mylayout)
plot(fig)
