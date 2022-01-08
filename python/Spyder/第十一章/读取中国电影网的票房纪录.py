import bs4
import requests
paiming=[]
r = requests.get("https://www.endata.com.cn/BoxOffice/BO/History/Movie/Alltimedomestic.html")
r.encoding = "utf-8"
soup = bs4.BeautifulSoup(r.text,"html.parser")
result = soup.find_all("td")
table = soup.find_all("table")
print(table)
# print(table)
# for i in div.find_all("tr"):
#     print(i)
#     text = i.td.String
#     paiming.append(text)
# print(paiming)
