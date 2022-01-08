#%%利用re
import requests
import re
import csv
f = open("电影票房.csv","w",encoding = 'utf-8',newline="")
csv_writer = csv.DictWriter(f,fieldnames=["名字","日期","总场次","废场","人次","上座率","票价"])
csv_writer.writeheader()
for page in range(10):
    if page == 0:
        url = "http://58921.com/daily/wangpiao"
    else:
        url = f"http://58921.com/daily/wangpiao?page={page}"
    resp = requests.get(url)
    resp.encoding = 'utf-8'
    web_content = resp.text
    obj = re.compile(r'<tr class=".*?">.*?<a href=".*?" title=".*?">(?P<名字>.*?)</a>.*?<td>(?P<日期>.*?)</td>.*?</a>.*?<td>(?P<总场次>.*?)</td>.*?<td>(?P<废场>.*?)</td>.*?<td>(?P<人次>.*?)</td>.*?<td>(?P<上座率>.*?)</td>.*?<td>(?P<票价>.*?)</td>',re.S)
    result = obj.finditer(web_content)
    for it in result:
        dic = it.groupdict()
        print(dic)
        csv_writer.writerow(dic)
    resp.close()
    print(f"第{page}页处理完毕")
f.close()