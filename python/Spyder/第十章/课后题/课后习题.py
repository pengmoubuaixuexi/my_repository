import numpy as np
import pandas as pd
excel = pd.read_excel("score.xlsx",sheet_name = [0,1],header = 0)
score = excel[0]
duty = excel[1]
# score = score.set_index("学号")
# duty = duty.set_index("学号")
# mergedata = pd.merge(duty,score,on = "学号", how = "right")
# mergedata = mergedata.fillna("学生")
print(score.head(3))
score["总分"] = score["语文"] + score["数学"] + score["英语"]
score = score.sort_values(by = "总分",ascending=False)
groupscore = score.groupby("性别")
avg = groupscore.mean()
Max = groupscore.max()
score.loc[( score["总分"] < 210 ),"等级"] = "C"
score.loc[( score["总分"] > 210),"等级" ] = "B"
score.loc[( score["总分"] > 270 ),"等级"] = "A"
print(avg)
print(Max)
print(score)
score = score.set_index("学号")
duty = duty.set_index("学号")
student = pd.merge(score,duty,on = "学号", how = "left")
student = student.fillna("学生")
student.to_excel("Student.xlsx",sheet_name = "Student_sheet")
print(student)
# print(duty)
# print(score)