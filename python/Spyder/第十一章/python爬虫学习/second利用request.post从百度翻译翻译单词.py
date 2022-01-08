import requests
url = 'https://fanyi.baidu.com/sug'
s = input("请输入你要翻译的英文\n")
dat = {
       "kw":s
       }
resp = requests.post(url,data = dat)
print(resp.json())#将服务器返回的内容直接变成json（）即字典