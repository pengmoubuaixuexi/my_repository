import matplotlib.pyplot as plt
import matplotlib
import pandas as pd
import numpy as np
data1 = pd.DataFrame({
        "编号": [1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009],
        "日期": pd.date_range('20181001', periods=9),
        "品牌": ['HW', 'Apple', 'samsung', 'HuaWei', 'xiaomi', 'OPPO', 'APPLE', 'NOKIA', 'vivo'],
        "型号": ['P20 Pro', 'iPhone XR', 'Note 9', 'Mate 20', 'MI 8', 
'Find X', 'iPhone XS', 'NOKIA 8 Sirocco', 'NEX'],
        "配置": ['6G-128G', '4G-128G', '6G-128G', '6G-128G', '8G-128G', '8G-256G', '4G-256G', '6G-128G', '8G-128G'],
        "价格": [4988, 6999, 6999, np.nan, 3599, 5999, 10165, 4399, 4298]
        },
        columns = ['编号', '日期', '品牌', '型号', '配置', '价格'])

data2 = pd.DataFrame({
     "编号": [1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1010],
     "国家": ['China', 'USA', 'Korea', 'China', 'China', 'China', 'USA', 'Finland', 'Japan'],
     "系统": ['Android', 'IOS', 'Android', 'Android', 'Android', 'Android', 'IOS', 'Android', 'Android'],
     "屏幕尺寸": [6.1, 6.1, 6.4, 6.5, 6.2, 6.4, 5.8, 5.5, 6]
     })
#数据清洗
avg_size = data1["价格"].mean()
data1["价格"] = data1["价格"].fillna(avg_size)
data1["价格"] = data1["价格"].astype(int)
data1["品牌"] = data1["品牌"].replace("HW","HUAWEI")
data1["品牌"] = data1["品牌"].str.upper()
#更换索引并合并
data1 = data1.set_index("编号")
data2 = data2.set_index("编号")
mergedata = pd.merge(data1,data2,on = "编号",how = "inner")
#细化配置
mergedata1 = pd.DataFrame( (i.split("-") for i in mergedata["配置"]),
                          index = mergedata.index ,
                          columns = ["运存\GB","运存\GB"])
mergedata = pd.merge(mergedata, mergedata1,  on="编号")
mergedata["价格档次"] = np.where(mergedata["价格"]>6000, "高档", "中档")
mergedata.loc[(mergedata["国家"] == "China") & (mergedata["屏幕尺寸"] >6.2),"国产大屏"] = "YES"
mergedata.to_csv("手机表.csv")
mergedata.to_excel("手机表.xlsx",sheet_name = "moblie_sheet")
print(data1)
print(data2)
print(mergedata)