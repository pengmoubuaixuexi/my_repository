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
		cout<<"���������� "<<endl;
		cin>>name;
 	void grade1
	{
		cout<<"�������꼶 "<<endl;
		cin>>grade;
	}
	void num1()
	{
		cout<<"��������� "<<endl;
		cin>>num;
	}
	void show()
	{
		cout<<name<<" "<<grade<<" "<<num<<" "<<add<<endl;
	}};
class student:public base{
public:
	add1(){
		cout<<"�������ַ "<<endl;
		cin>>add;
	}
};
int main()
{
	student s[2];
}
