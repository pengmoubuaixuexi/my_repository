#include <iostream>
using namespace std;
class base{
protected:
    char name[8];
    int num;
    int grade;
public:
    base()
    {
        cout<<"姓名 ";
        cin>>name;
        cout<<"年级";
        cin>>grade;
    }
    void print()
    {
        cout<<"姓名"<<name<<"  "<<num<<endl;
    }
    virtual int isgood()=0;
};
class student:public base{
public:
    student()
    {
        cout<<"输入成绩"<<endl;
        cin>>num;
    }

    int isgood()
    {
        if(num>90)
            return 1;
        else
            return 0;
    }
};
class teacher:public base{
public:
    teacher()
    {
        cout<<"输入论文数"<<endl;
        cin>>num;
    }
    int isgood()
    {
        if(num>3)
            return 1;
        else
            return 0;
    }
};

int main()
{
    cout<<"请输入学生情况"<<endl;
    student s[2];
    cout<<"请输入老师情况"<<endl;
    teacher t[2];
    	int i;

	base *p;
	cout<<"\n优秀学生：\n";
	for(i=0,p=s;i<2;i++,p++)
		if(p->isgood())
            p->print();
	 cout<<"\n优秀教师候选人：\n";
	for(i=0,p=t;i<2;i++,p++)
		if(p->isgood())
            p->print();

}
