from urllib.request import urlopen
url = "http://www.baidu.com"
r = urlopen(url)
with open("mybaidu.html",mode = "w",encoding="utf-8") as file:
    file.write(r.read().decode("utf-8"))
print("over!")