#专门用于COVID-19文件查找国家编号名字，并返回json文件。
import bs4
import requests
import json
url = "https://www.ufsoo.com/news/detail-59307681-b5e1-4328-a6e6-20fddd6c5ec6.html"
user_agent = "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36 Edg/96.0.1054.43"
headers = {"User-agent":user_agent}
r = requests.get(url,headers = headers)
r.encoding = "utf-8"
soup = bs4.BeautifulSoup(r.text,"html.parser")
table = soup.find("table")
tr = table.find_all("tr")
zonglst=[]
for i in tr:
    lst = []
    for j in i.find_all("td"):
        lst.append(j.get_text())
    zonglst.append(lst)
LST = {}
for i in zonglst:
    if len(i) > 6 :
        LST[i[1].strip("\t").strip("\n").strip("\t")] = i[5].strip("\n").strip("\t").strip("\n")
LST["CHN"] = "中国"
LST["JPN"] = "日本本土"
LST["BGD"] = "孟加拉国"
LST["KOR"] = "韩国"
LST["CAF"] = "中非共和国"
LST["CGK"] = "印度尼西亚"
LST["MNG"] = "蒙古"
del LST["HKG"]
with open("name_map1.json","r",encoding = "utf-8")as fp:
    name = json.load(fp)
    print(name)
for i in name:
    for j in LST:
        if name[i] == LST[j]:
            name[i] = j
            break
name["Indonesia"] = "IDN"
print(name)
with open("name_map2.json","w",encoding = "utf-8")as fp:
    json.dump(name,fp)