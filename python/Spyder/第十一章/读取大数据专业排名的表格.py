import bs4
import requests
url = "https://www.dxsbb.com/news/7566.html"
r = requests.get(url)
r.encoding = "GBK"
soup = bs4.BeautifulSoup(r.text,"html.parser")
# div = soup.find("div",{"class":"newsmainBody"})
# div = div.find("div",{"class":"newsareaL subWebLR"})
# div = div.find("div",{"class":"webBox"})
# div = div.find("div",id = "content")
# div = div.find("div",{"class":"article"})
# div = div.find("div",{"class":"tablebox"})
table = soup.find("table")
tr = table.find_all("tr")
zonglst=[]
for i in tr:
    lst = []
    for j in i.find_all("td"):
        lst.append(j.get_text())
    zonglst.append(lst)
print(zonglst)
for i in zonglst:
    for j in i:
        if j == '江西财经大学':
            print(i[0])
