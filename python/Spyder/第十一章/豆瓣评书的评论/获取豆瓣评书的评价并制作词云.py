import requests
import bs4
import time
import random
# agent_list = [
#     "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/14.0.835.163 Safari/535.1",
#     "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:6.0) Gecko/20100101 Firefox/6.0",
#     "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50",
#     "Opera/9.80 (Windows NT 6.1; U; zh-cn) Presto/2.9.168 Version/11.50",
#     "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36"
# ]

for i in range(1,11):
    all_user = []
    all_comment=[]
    all=[]
    # user_agent = random.choice(agent_list)
    user_agent = 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400'
    url = "https://book.douban.com/subject/1255625/comments/?start="+str(i*20)+"&limit=20&status=P&sort=new_score"
    headers = {"User-agent":user_agent}
    r = requests.get(url,headers=headers)
    r.raise_for_status()
    r.encoding = "utf-8"
    soup = bs4.BeautifulSoup(r.text,"html.parser")
    for each in soup.find_all("span",class_="comment-info"):
        user = each.get_text(":",strip = True)+'\n'
        all_user.append(user)
    for each in soup.find_all("p",class_="comment-content"):
        comment = each.span.string+'\n'
        all_comment.append(comment)
    n=0
    for j in soup.find_all("span",class_="short"):#此循环仅是用来让数量和需要导入的text相同而已。使导入的评论确定是全部导入。
        text = all_user[n]+all_comment[n]
        n=n+1
        all.append(text)
    time.sleep(3)
    print("第{}页处理完成".format(i))
    with open("豆瓣书评天龙八部第{}页.txt".format(i),"w",encoding="utf-8") as file:
        for j in all:
            file.writelines(j)
