from bs4 import BeautifulSoup
import requests

r = 'http://www.toutiao.com/a6389133537292304642/'
headers = {'user-agent': 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3872.400 QQBrowser/10.8.4455.400'}
url = requests.get(r,headers=headers)
soup = BeautifulSoup(url.text,'lxml')
print(soup.get_text())