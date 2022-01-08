import requests
import re
father_url = "https://www.dytt89.com/"
resp = requests.get(father_url,verify = False)#取消安全验证
resp.encoding = 'gb2312'
obj1 = re.compile("2021必看热片.*?<ul>(?P<ul>.*?)</ul>",re.S)
obj2 = re.compile("<li><a href='(?P<href>.*?)'",re.S)
obj3 = re.compile('<br />◎片　　名　(?P<name>.*?)<br />.*?<td style="WORD-WRAP: break-word" bgcolor="#fdfddf"><a href="(?P<url>.*?)">magnet',re.S)
allchild_url=[]
for it in obj1.finditer(resp.text):
    ul = it.group("ul")
    for itt in obj2.finditer(ul):
        child_url = father_url + itt.group("href").strip("/")
        allchild_url.append(child_url)
for url in allchild_url:
    resp = requests.get(url,verify = False)#取消会报warning
    resp.encoding = "gb2312"
    result = obj3.finditer(resp.text)
    for it in result:
        print(it.group("name"))
        print(it.group("url"))
    