#%%
import bs4
import requests
url = "https://www.endata.com.cn/BoxOffice/BO/Year/index.html"
headers = {"User-agent":"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.835.163 Safari/535.1"}
r = requests.get(url,headers = headers)
r.encoding = "utf-8"
soup = bs4.BeautifulSoup(r.text,"html.parser")
img = soup.find_all("img")
print(img[0])
