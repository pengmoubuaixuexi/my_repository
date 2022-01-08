# import pandas as pd
# data = pd.read_excel("暑期课表.xlsx")
# data.to_excel("score.xlsx",index=3)
import pandas as pd
data = pd.read_excel("暑期课表.xlsx")
data.to_json("data.json",force_ascii=False)
jsondata=pd.read_json("data.json")
print(jsondata)