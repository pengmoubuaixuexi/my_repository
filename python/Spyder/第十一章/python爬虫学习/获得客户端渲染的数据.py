import requests
url = 'https://movie.douban.com/j/chart/top_list'
header = {
    "User-Agent": "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.54 Safari/537.36"}
param ={
    "type": "24",
    "interval_id": "100:90",
    "action": "",
    "start": "0",
    "limit": "20"
        }
resp = requests.get(url,params = param,headers= header)
print(resp.text)
# print(resp.json())