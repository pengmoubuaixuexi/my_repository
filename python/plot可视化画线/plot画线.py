from plotly.offline import plot
import plotly.express as px
import pandas as pd
dataset=pd.DataFrame({"x":[1,2],"y":[5,6]})
figure=px.line(dataset,x="x",y="y")#可以直接x=[1,2]这样
plot(figure)