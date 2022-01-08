#include <iostream>
using namespace std;
class SET{
protected:
    int *a;
    int len;
public:
    SET(int *p,int n)
    {
        len=n;
        a=new int(len);
        for(int i=0;i<len;i++)
            a[i]=p[i];
    }
    int operator ==(int m)
    {
        int i=0;
        for(i=0;i<len;i++)
            if(m==a[i])
            return 0;
        else
            return 1;
    }
    friend int operator ==(SET &s1,SET &s2)
    {
        if(s1.len!=s2.len)
            return 0;
        for(int i=0;i<s1.len;i++)
            if(!(s1==s2.a[i]))
            return 0;
            return 1;
    }
    void print()
    {
        for(int i=0;i<len;i++)
        cout<<a[i]<<'\t';
        cout<<'\n';
    }
};
int main()
{
    int a[]={1,2,3,4,5},b[]={1,2,3,4,5},c[]={1,2,3,4,5,6},d[]={1,3,5,7,9};
	SET s1(a,5),s2(b,5),s3(c,6),s4(d,5);

	cout<<"a:\t";s1.print();
	cout<<"b:\t";s2.print();
	cout<<"c:\t";s3.print();
	cout<<"d:\t";s4.print();
	if(s1==s2)cout<<"a==b\n";
	else cout<<"a!=b\n";
	if(s1==s3)cout<<"a==c\n";
	else cout<<"a!=c\n";
	if(s1==s4)cout<<"a==d\n";
	else cout<<"a!=d\n";
}
