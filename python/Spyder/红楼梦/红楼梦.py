import jieba
import wordcloud
import matplotlib.pyplot as plt
from imageio import imread
def open1():
    data = open("红楼梦.txt","r",encoding = "utf-8")
    text = data.read()
    data.close()
    return text
def fenci(text,topK):
    text = jieba.lcut(text)
    b={}
    for i in text:
        if len(i) != 1:
            b[i] = b.get(i,0)+1
    data = open("stop_words.txt","r",encoding = "utf-8")
    text1 = data.read()
    data.close()
    text1 = jieba.lcut(text1)
    for i in text1:
        try:
            del b[i]
        except KeyError:
            print(end = "")
    data = open("处理后的词汇及频率.txt","w")
    b = sorted(b.items(),key = lambda x:(-x[1],x[0]))
    for i in range(topK):
        data.write("{}\t{}\n".format(b[i][0],b[i][1]))
    b=dict(b[:topK])
    print(b)
    return b
text = open1()
text = fenci(text,100)
# text = dict(sorted(text,key = lambda x:(-x[1],x[0])))
bg_pic = imread("star.jpg")
w = wordcloud.WordCloud(font_path = 'C:\Windows\Fonts\simhei.ttf',background_color = "white",width = 1000,max_words = 500,mask = bg_pic,height = 860,margin = 2).fit_words(text)
w.to_file("红楼梦_star.jpg")
plt.imshow(w)
plt.axis("off")
plt.show()
print("结束")
