#%%利用bs4
import bs4
import requests
url = "http://58921.com/daily/wangpiao"
headers = {"User-agent":"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400"}
r = requests.get(url,headers = headers)
r.encoding = 'utf-8'
soup = bs4.BeautifulSoup(r.text,"html.parser")
table = soup.find("table")
a=[]
for i in table.find_all("tr"):
    lst=[]
    for j in i.find_all("td"):
        text = j.string
        lst.append(text)
    a.append(lst)
print(a)