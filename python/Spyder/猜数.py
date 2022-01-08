import random
a = random.randint(1,100)
print("已经成功生成了一个1~100的整数，无奖竞猜",end = "")
while True:
    b = int(input())
    if b > a:
        print("猜大了")
    elif b < a:
        print("猜小了")
    else:
        print("猜对了就是{}".format(a))
        break
