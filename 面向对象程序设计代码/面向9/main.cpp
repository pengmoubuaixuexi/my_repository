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
        cout<<"���� ";
        cin>>name;
        cout<<"�꼶";
        cin>>grade;
    }
    void print()
    {
        cout<<"����"<<name<<"  "<<num<<endl;
    }
    virtual int isgood()=0;
};
class student:public base{
public:
    student()
    {
        cout<<"����ɼ�"<<endl;
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
        cout<<"����������"<<endl;
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
    cout<<"������ѧ�����"<<endl;
    student s[2];
    cout<<"��������ʦ���"<<endl;
    teacher t[2];
    	int i;

	base *p;
	cout<<"\n����ѧ����\n";
	for(i=0,p=s;i<2;i++,p++)
		if(p->isgood())
            p->print();
	 cout<<"\n�����ʦ��ѡ�ˣ�\n";
	for(i=0,p=t;i<2;i++,p++)
		if(p->isgood())
            p->print();

}
