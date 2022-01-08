import requests
from bs4 import BeautifulSoup,element
code = '''<html><head>
<title>网页标题</title></head>
<body><h2>金庸群侠传</h2>
<table width="400px" border="1">
        <tr><th>书名</th> <th>人物</th> <th>年份</th></tr>
        <tr><td>《射雕英雄传》</td> <td>郭靖</td> <td>1959年</td></tr>
        <tr><td>《倚天屠龙记》</td> <td>张无忌</td> <td>1961年</td></tr>
        <tr><td>《笑傲江湖》</td> <td>令狐冲</td> <td>1967年</td></tr>
        <tr><td>《鹿鼎记》</td> <td>韦小宝</td> <td>1972年</td></tr>
</table></body></html>'''

soup = BeautifulSoup(code,"html.parser")
print(soup.table.contents)
for i in soup.table.children:
    if type(i) !=element.NavigableString:
        # print(type(i))
        print(i)
for i in soup.table.descendants:
    if type(i) !=element.NavigableString:
        # print(type(i))
        print(i)
for i in soup.table.tr.next_siblings:
    if type(i) != element.NavigableString:
        print(i)


