#解密付费音乐权限机制Python爬虫实现VIP全音乐下载
#爬虫: 获取网站数据的程序 百度 baiduspider
#1.获取目标 2.产生交互(两个+) 3.筛选数据 4.保存数据
#NBA     交互过程    一大推的数据 (当前页面的全部数据)  保存到本地
import requests  #用Python代码伪装成浏览器向服务器发起网络请求
import json #转换数据格式
import time

def main():
    #歌手
    geshou = str(input('请输入指定歌手的名称: '))
    #歌曲的页数
    yeshu = int(input('请输入指定歌曲的页数: '))
    for i in range(1,yeshu+1):
        #1.获取到了对应的url
        url = "http://www.kuwo.cn/api/www/search/searchMusicBykeyWord?key={}&pn={}&rn=30&httpsStatus=1&reqId=011898e0-a1d4-11eb-9959-2579d87a9219".format(geshou,i)
        #准备开始交互
        headers = {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.128 Safari/537.36",
            "Referer": "http://www.kuwo.cn/search/list?key=%E5%91%A8%E6%9D%B0%E4%BC%A6",
            'csrf': 'P4LXXLOCL4L',
            'Cookie': '_ga=GA1.2.1345614870.1610439929; Hm_lvt_cdb524f42f0ce19b169a8071123a4797=1616591340,1618921275; Hm_lpvt_cdb524f42f0ce19b169a8071123a4797=1618921275; _gid=GA1.2.2058906197.1618921275; kw_token=P4LXXLOCL4L'
        }
        #开始发送请求
        result = requests.get(url,headers=headers)
        print(result.text)
        jsons = json.loads(result.text)
        # print(jsons)
        data = jsons['data']['list']
        # print(data)
        # 30歌曲  i 已经是代表30首歌曲了
        for i in data:
            #音乐的ID
            rid = i['rid']
            #音乐名字
            name = i['name']
            # print(name)
            #拿到指定歌手的歌曲音乐路径 需要自己组合
            url = "http://www.kuwo.cn/url?format=mp3&rid={}&response=url&type=convert_url3&br=128kmp3&from=web&t=1618923061933&httpsStatus=1&reqId=0fc1ece1-a1d7-11eb-a53f-9fde6b44e565".format(rid)
            res = requests.get(url,headers=headers).json()
            music_url = res['url']
            with open('正经人/{}.mp3'.format(name),'wb')as f:
                print('正在下载{}'.format(name),end='')
                music = requests.get(music_url)
                f.write(music.content)
                print('\t下载完毕')
                time.sleep(3)
main()






