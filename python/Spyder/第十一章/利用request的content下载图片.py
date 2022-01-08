import requests
r = requests.get("http://www.baidu.com/img/bd_logo1.png")
path = "F:\我\python\Spyder\第十一章\\baidu.png"
with open(path,"wb") as file:
    file.write(r.content)


