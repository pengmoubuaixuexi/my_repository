from bs4 import BeautifulSoup
import requests
for i in range(1,10):
    url = "https://movie.douban.com/top250?start="+str(i*25)+"&filter="
    headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36'}
    r=requests.get(url,headers=headers)
    soup = BeautifulSoup(r.text,'html.parser')
    a=[]
    for each in soup.find_all('div',class_='info'):
        img_url = each.previous_sibling.previous_sibling.a.img['src']#图片链接//previous_sibling表示上个兄弟标签
        # print(img_url)
        '''with open('*.jpg','wb') as img:#还可以顺便下载回来，名字自起
        img.write(requests.get(img_url,headers=headers).content)'''
        title=each.find('div',class_='hd').get_text(strip=True).replace('\xa0','')#标题  strip 表示是否按原来位置换行输出，get_text 表示获取使用给定分隔符连接的所有子字符串。
        actor = list(each.find('p',class_='').strings)[0].strip().replace('\xa0','')#导演演员
        type_ = list(each.find('p',class_='').strings)[1].strip().replace('\xa0','')#类型
        score = each.find('div',class_='star').get_text('/',strip=True)#评分及人数
        if each.find('span',class_='inq'):
            quote = each.find('span',class_='inq').get_text()#一句话总结  一句话的get_text()和string相同
        else :
            quote = "这部电影没有总结"
        print([img_url,title,actor,type_,score,quote])#这里只简单打出来看下，怎样存储由你来决定
        a.append([img_url,title,actor,type_,score,quote])
    with open("豆瓣电影top250第{}页.txt".format(i),"w",encoding="utf-8") as file:
        for i in a:
            file.writelines(i)
