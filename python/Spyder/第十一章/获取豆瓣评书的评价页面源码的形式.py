import requests
import time
url = "https://book.douban.com/subject/35502692/comments/?start="
for i in range(1,11):
    try:
        r = requests.get(url+str(i*20)+"&limit=20&status=P&sort=new_score",headers = {"User-agent":"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400"})
        r.raise_for_status()
        r.encoding = "utf-8"
        
        path = "F:\我\python\Spyder\第十一章\\评论第{}页".format(i)
        with open(path,"w",encoding = "utf-8") as file:
            file.write(r.text)
        time.sleep(3)
    except Exception as ex:
        print("第{}页采集出错，出错原因{}".format(i,ex))