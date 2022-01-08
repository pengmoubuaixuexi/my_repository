from plotly.offline import plot
from plotly import figure_factory as FF
import pandas as pd
data=pd.DataFrame([["2050921018","詹延峰","计算数学",65,85,76],
                  ["2050921036","李小鹏","金融学类",86,95,85],
                  ["2050921039","装凡法","经济学类",86,95,65],
                  ["2040912116","茅舒瑶","社会保障",90,95,100],
                  ["205091201","陈见影","化学工程",62,75,92],
                  ["2050912064","梅钦钦","材料科学",87,95,80],
                  ["2050109153","王影平","大气科学",86,89,72],
                  ["2050151003","韩平医","大气工程",82,99,60]],
columns=("学号","姓名","专业","笔试","平时","实验") )
table = FF.create_table(data) #用plotly产 生输出表格
plot(table,filename = "彭涛的第一次.html", show_link="www.baidu.com")
