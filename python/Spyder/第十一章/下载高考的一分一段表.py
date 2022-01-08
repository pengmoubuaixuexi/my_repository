import bs4
import requests
url = ["https://www.dxsbb.com/upFiles/infoImg/20210626103255833.png"
        ,"https://www.dxsbb.com/upFiles/infoImg/20210626103256005.png"
        ,"https://www.dxsbb.com/upFiles/infoImg/20210626103256874.png"
        ,"https://www.dxsbb.com/upFiles/infoImg/20210626103257515.png"]
for i in range(4):
    r = requests.get(url[i])
    path = "F:\我\python\Spyder\第十一章\\一分一段表第{}页.png".format(i+1)
    with open(path,"wb") as file:
        file.write(r.content)