import requests
# myheader = {
#     "User-Agemt":"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400"}
# url = "https://www.zhihu.com"
# r = requests.get(url, headers = myheader)
# r = requests.get(url = "https://www.zhihu.com",headers = {'User-agent': "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400"})
r = requests.get(url = "https://www.zhihu.com",headers = {"User-Agent":"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3877.400 QQBrowser/10.8.4506.400"})
# print(r.encoding)
# print(r.status_code)
# print(r.text)
print(r.content.decode("utf-8"))
# print(r.cookies)
# print()
# print()
# print(r.headers)