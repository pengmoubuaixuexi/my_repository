#include <iostream>
#include<string.h>
using namespace std;
class String_Integer{
protected:
    char *s;
    int num;
public:
    String_Integer(char *str)
    {
    s=new char[strlen(str)+1];
		strcpy(s,str);
    }
    int in ()
    {
        int num=0;
        char *p;
        for(p=s;*p;p++){
        if('0'<=*p&&*p<='9')
        num=num*10+*p-'0';}
		cout<<num<<endl;
    }
    void show()
    {
        cout<<s<<endl;
    }
    ~String_Integer()
	{
		delete []s;
	}
};
int main()
{
	char str[50];
	cout<<"�������ַ���ab12  3c00d45ef ��";
	cin.getline(str,50);
	String_Integer test(str);
	test.show();
	test.in();
}
