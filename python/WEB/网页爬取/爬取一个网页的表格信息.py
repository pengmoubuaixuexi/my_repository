from requests_html import HTMLSession
session = HTMLSession()
url = "https://www.dxsbb.com/news/7566.html"
r = session.get(url)
table = r.html.find("tbody>tr")
for i in range(10):
    l=table[i].text.split()
    s=''
    for j in l:
        s=s+"{0:^14}".format(j)
    print(s)