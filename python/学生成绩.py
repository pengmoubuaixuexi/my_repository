studentid = {}
score = {}
studentscore = {}
course=set()
while True:
    s = input().split(',')
    if len(s) == 1:
        break
    if len(s) == 2:
        studentid[s[0]]=s[1]
    elif len(s)==3:
        # xuehao xingming
        # xuehao kecheng chengji
        score = studentscore.get(s[0],{})
        score[s[1]] = s[2]#每次的s[1]不同，就在score中存入不同科目的成绩
        studentscore[s[0]] = score
        course.add(s[1])
coursename = list(course)
print("学号"+","+"姓名"+",",end='')
for name in coursename:
        print(name+',',end='')
print('平均分')
for id in studentid:
    print(id+','+studentid[id],end='')
    score = studentscore[id]
    cnt=0
    sum=0
    for name in coursename:
        print(',',end='')
        if name in score:
            print(score[name],end='')
            sum+=int(score[name])
            cnt+=1
    print(","+str(int(sum/cnt)))
    