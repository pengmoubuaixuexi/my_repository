class Student:
    name="null"
    number = 0
    def __init__(this,mname,mnumber,halo):
        this.name=mname
        this.number = mnumber
        this.halo=halo
    def printf(this):
        print(this.name+":"+this.number)
    @classmethod
    def printf1(cls):
        print(cls.name)
class DAYI(Student):
    def __init__(self,name,number,teacher,halo):
        super().__init__(name,number,halo)
        self.teacher=teacher
stu1=Student("彭某涛","0201086","hello world")
stu1.printf()
print(stu1.name)
Student.name="爸爸"
Student.GPA=0#可动态增加类变量
print(str(Student.GPA)+";"+str(stu1.GPA))
stu1.GPA=3.8
print(str(Student.GPA)+";"+str(stu1.GPA))
print(Student.name)
Student.printf1()
stu2=DAYI("彭某涛","0201086","王民","hello world")
print(stu2.name+stu2.teacher)