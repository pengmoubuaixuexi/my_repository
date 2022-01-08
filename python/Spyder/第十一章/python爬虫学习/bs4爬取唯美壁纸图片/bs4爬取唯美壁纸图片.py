import requests
import bs4
url = 'https://umei.cc/bizhitupian/weimeibizhi/index_6.htm'
count=0
while url!=0:
    resp = requests.get(url)
    resp.encoding = 'utf-8'
    soup = bs4.BeautifulSoup(resp.text,"html.parser")
    a = soup.find_all("a",class_="TypeBigPics")
    for i in a:
        img_url = i.img["src"].replace("small","")
        path = i.span.string+".jpg"
        print(path)
        resp1 = requests.get(img_url)
        with open(path,"wb")as file:
            file.write(resp1.content)
    web_div = soup.find("div",class_="NewPages")
    web_url = web_div.find_all("a")
    count = count +1
    print(f"第{count}处理完毕")
    if len(web_url) == 4:
        break
    else:
        url = "https://umei.cc/"+web_url[-2]["href"]