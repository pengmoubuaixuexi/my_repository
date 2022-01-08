import dash
import dash_core_components as dcc
import dash_html_components as html
import pandas as pd
import plotly.express as px
dataset=pd.read_excel("gapminder.xlsx")
fig = px.scatter(dataset, x="income", y="life_exp", animation_frame="year",
                 animation_group="country",size="income", color="continent",
                 hover_name="country",log_x=True, size_max=45,
                 range_x=[500,200000], range_y=[25,90],
                labels=dict(income="人均收入(PPP购买力标准)",life_exp="人均寿命"))
app = dash.Dash(__name__)    #创建Web应用程序，即App
app.layout = html.Div([
    html.H1(children='人均收入和人均寿命关系图',style={'textAlign': 'center'}),
    html.Div([dcc.Graph(figure=fig)])
])
app.run_server()
