#include <iostream>
#include<math.h>
using namespace std;
class point{
protected:
    int x1,y1;
public:
    point(int a,int b)
    {
        x1=a;
        y1=b;
    }
};
class line:public point{
protected:
    int x2,y2;
public:
    line(int a,int b,int c,int d):point(a,b)
    {
        x2=c;
        y2=d;
    }
};
class trin:public line{
protected:
    int x3,y3;
    double area;
public:
    trin(int a,int b,int c,int d,int e,int f):line(a,b,c,d)
    {
        x3=e;
        y3=f;
    }
    void f()
    {
        double x,y,z,s;
        x=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        y=sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        z=sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        s=(x+y+z)/2;
        area=sqrt(s*(s-z)*(s-y)*(s-x));
    }
	void print()
	{
		cout<<"( "<<x1<<','<<y1<<" )"<<'\t';
		cout<<"( "<<x2<<','<<y2<<" )"<<'\t';
		cout<<"( "<<x3<<','<<y3<<" )"<<'\n';
		cout<<"\narea="<<area<<endl;
	}
};
int main()
{
    int a=1,b=1,c=4,d=1,e=4,f=5;
    trin tri(a,b,c,d,e,f);
    tri.f();
    tri.print();
}
