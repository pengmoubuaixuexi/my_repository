import requests
import bs4
#读取百度图片美女照片地址并下载
url = "http://cn.bing.com/images/search?q=%E7%BE%8E%E5%A5%B3&qs=n&form=QBILPG&sp=-1&pq=%E7%BE%8E%E5%A5%B3&sc=7-2&cvid=BAD168E762664599A2B4F7DC572072F4&first=1&cw=1177&ch=683&tsc=ImageBasicHover"
# https://pic.sogou.com/d?query=%E7%BE%8E%E5%A5%B3%E5%9B%BE%E7%89%87&forbidqc=&entityid=&preQuery=&rawQuery=&queryList=&st=&did=1
headers = {"User-agent":"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400"}
r = requests.get(url,headers=headers)
r.encoding = "utf-8"
soup = bs4.BeautifulSoup(r.text,"html.parser")
div = soup.find_all("div",class_="imgpt")
k=0
c=0
all_img_url=[]
for i in div:
    k+=1;
    try:
        img_url = i.a.img["src"]
        if img_url[:4] == "data":
            print("第{}张图片的网址被封".format(k))
            continue
        print(img_url)
        all_img_url.append(img_url)
        c+=1;
    except Exception:
        img_url = i.a.img["data-src"]
        print(img_url)
        all_img_url.append(img_url)
        c+=1
for i in range(c):
    path = "送给王健的第{}张美女图片.png".format(i+1)
    with open(path,"wb") as file:
        r1 = requests.get(all_img_url[i])
        file.write(r1.content)