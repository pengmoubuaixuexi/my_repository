import bs4
import requests
code = '''<html>
<body bgcolor="#eeeeee">
	<style>
		.css1 { background-color:yellow; color:green; font-style:italic;}
	</style>
	<h1 align="center">这里是标题行</h1>
	<p name="p1" class="css1">这是第一段</p>
	<p name="p2" class="css1">这是第二段</p>

	<img src="http://www.baidu.com/img/bd_logo1.png" style="width:200px;height:100px"></img>
	<a id='link' href="http://baidu.com">点我跳去百度</a>
</body>
</html>'''
soup = bs4.BeautifulSoup(code,"html.parser")
a = soup.find_all(["h1","p"])
print(a)
b = soup.find_all(id = "link")
print(b)
c = soup.find_all("h1",align = "center")
print(c)
d = soup.find_all(class_ = "css1")
print(d)
f = soup.find_all("p",attrs = {"name":"p2"})
print(f)
import re
e = soup.find_all(text = re.compile("是"),limit = 2)
print(e)
