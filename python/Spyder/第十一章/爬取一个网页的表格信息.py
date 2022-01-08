from requests_html import HTMLSession
session = HTMLSession()
url = "https://www.endata.com.cn/BoxOffice/BO/Year/index.html"
r = session.get(url)
table = r.html.find("tbody>tr")
for i in range(10):
    l=table[i].text.split()
    s=''
    for j in l:
        s=s+"{0:^14}".format(j)
    print(s)