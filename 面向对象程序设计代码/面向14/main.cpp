#include <iostream>
using namespace std;
class container{
protected:
    double r;
public:
    container(double radius)
	{
		container::r=radius;
	}
	virtual double surface_area()=0;
	virtual double volume()=0;
};
class cube:public container{
    public:
    cube(double radius):container(radius){ };
        double volume()
        {
            return (4.0/3.0)*3.14*r*r*r;
        }
        double surface_area()
        {
            return 4*3.14*r*r;
        }
};
class sphere:public container{
public:
    sphere(double radius):container(radius){};
        double volume()
        {
            return r*r*r;
        }
        double surface_area()
        {
            return 6*r*r;
        }
};
class cylinder:public container{
public:
    cylinder(double radius):container(radius){};
        double volume()
        {
            return 3.14*r*r*r;
        }
        double surface_area()
        {
            return 2*3.14*r*r+2*3.14*r*r;
        }
};
int main()
{
    {
	container *p;             //定义抽象类指针p
	cube obj1(10);            //创建正方体对象obj1
	sphere obj2(6);            //创建球体对象obj2
	cylinder obj3(4);        //创建圆柱体对象obj3
	p=&obj1;                  //指针p指向正方体对象obj1
	cout<<"输出结果："<<endl;
	cout<<"   正方体表面积："<<p->surface_area()<<endl;
	cout<<"   正方体体积：  "<<p->volume()<<endl;
	p=&obj2;                   //指针p指向球体对象obj2
	cout<<"   球体的表面积："<<p->surface_area()<<endl;
	cout<<"   球体的体积：  "<<p->volume()<<endl;
	p=&obj3;                    //指针p指向圆柱体对象obj3
	cout<<"   圆体的表面积："<<p->surface_area()<<endl;
	cout<<"   圆体的体积：  "<<p->volume()<<endl;
}
}
