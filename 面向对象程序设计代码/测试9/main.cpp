#include<iostream>
using namespace std;
class base{
protected:
	char name;
	int grade;
	int num;
	char add;
public:
	 base()
	{
		cout<<"请输入名字 "<<endl;
		cin>>name;
 	void grade1
	{
		cout<<"请输入年级 "<<endl;
		cin>>grade;
	}
	void num1()
	{
		cout<<"请输入分数 "<<endl;
		cin>>num;
	}
	void show()
	{
		cout<<name<<" "<<grade<<" "<<num<<" "<<add<<endl;
	}};
class student:public base{
public:
	add1(){
		cout<<"请输入地址 "<<endl;
		cin>>add;
	}
};
int main()
{
	student s[2];
}
