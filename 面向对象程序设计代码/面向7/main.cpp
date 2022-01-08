#include <iostream>
using namespace std;
class RECT{
    protected:
    double x,y;
    public:
    RECT(double x1,double y1){x=x1;y=y1;}
    virtual double area()
    {
        double s;
        s=x*y;
        return s;
    }
    double peri()
    {
        double c;
        c=2*(x+y);
        return c;
    }
    virtual int issquare()
    {
        if(x==y)
            return 1;
        else
            return 0;
    }
};
class CUB:public RECT{
    double height;
public:
    CUB(double x,double y,double h):RECT(x,y)
    {
        height=h;
    }
    double v()
    {
        double v;
        v=RECT::area()*height;
        return v;
    }
    double area()
    {
        double s1;
        s1=2*(x*y+y*height+x*height);
        return s1;
    }
    int issQuare()
    {
        if(x==y&&y==height)
            return 12;
        else
            return 0;
    }
    };
int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    CUB cu(a,b,c);
    RECT *re;
    re=&cu;
    cout<<"体积是"<<cu.v()<<endl;
    cout<<"表面积是"<<cu.area()<<endl;
    if(cu.issQuare())
        cout<<"是"<<endl;
    else
        cout<<"不是"<<endl;
}
