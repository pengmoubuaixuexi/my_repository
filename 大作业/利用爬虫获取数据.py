#由于网上现有的数据非及时更新的，而我们做的是一个实时的新冠疫情地图，
#因此我们自己使用爬虫获取腾讯网的一个实时更新的数据，之后的数据使用从idata上下载的详细数据
#这是腾讯的实时更新的网站https://news.qq.com/zt2020/page/feiyan.htm#/global?nojump=1
#因为是客户端渲染的，所以我们从检查中的网络找到真正的目标网页。
import pandas as pd
import json
import requests
user_agent = "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36 Edg/96.0.1054.43"
def get_foreight():
    url = "https://api.inews.qq.com/newsqa/v1/automation/modules/list?modules=FAutoCountryConfirmAdd,WomWorld,WomAboard"
    headers = {"User-agent":user_agent}
    re = requests.get(url,headers = headers)
    re_dit = re.json()
    foreignt_dit = re_dit["data"]["WomAboard"]
    return foreignt_dit
def get_china():
    url = "https://api.inews.qq.com/newsqa/v1/query/inner/publish/modules/list?modules=chinaDayList,chinaDayAddList,nowConfirmStatis,provinceCompare"
    headers = {"User-agent":user_agent}
    re = requests.get(url,headers = headers)
    re_dit = re.json()
    china_dit = re_dit["data"]["chinaDayList"]
    change_china_dit = {'continent':"亚洲","name":"中国","confirm":china_dit[-1]["confirm"],
                        "confirmAdd":-int(china_dit[-2]["confirm"])+int(china_dit[-1]["confirm"]),
                        "dead":china_dit[-1]["dead"],"deadCompare":-int(china_dit[-2]["dead"])+int(china_dit[-1]["dead"]),
                        "heal":china_dit[-1]["heal"],"healCompare":-int(china_dit[-2]["heal"])+int(china_dit[-1]["heal"]),
                        "pub_date":china_dit[-1]["y"]+str(china_dit[-1]["date"]).replace(".",""),"y":china_dit[-1]["y"],"date":str(china_dit[-1]["date"]),
                        'nowConfirm':china_dit[-1]['nowConfirm'],'nowConfirmCompare':int(china_dit[-1]['nowConfirm']-china_dit[-2]['nowConfirm']),
                        'confirmAddCut': 0,'suspect': 0,'confirmCompare': 0
                        }
    return change_china_dit
def savefile():
    all_country = get_foreight()
    all_country.append(get_china())
    all_country = sorted(all_country,key = lambda x: x["confirm"],reverse=True)
    data = pd.DataFrame(all_country)
    data.to_excel("全球疫情数据.xlsx",encoding = 'utf-8')
savefile()

