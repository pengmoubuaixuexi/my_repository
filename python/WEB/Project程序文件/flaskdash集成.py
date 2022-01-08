import flask
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
server = flask.Flask(__name__)
@server.route('/')
def index():
    return 'Hello Flask '
app = dash.Dash(__name__,server=server,routes_pathname_prefix='/dash/')
app.layout = html.Div([  
    html.H1( #第一行
        children='人均收入和人均寿命关系图',
        style={'textAlign': 'center','color': "#111111" }  #黑色
    ),
    html.Div([ #第二行
    #Column 1
        html.Div([html.Br([]), html.Br([]),  #空行
                 html.H6('使用的第三方模块：'),
                 html.P('Pandas--数据分析'),
                 html.P('Dash--Web应用程序框架')],
                className = "two columns"),
    #Column 2
       html.Div([dcc.Graph(figure=fig)], className = "ten columns"),
    ],className = "row ")])

if __name__ == '__main__':
    server.run()

