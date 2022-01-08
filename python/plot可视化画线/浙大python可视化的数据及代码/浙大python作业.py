import pandas as pd
data=pd.read_excel("income.xlsx")
wdata=data.melt(id_vars="country",var_name="year",value_name="income")
print(wdata)