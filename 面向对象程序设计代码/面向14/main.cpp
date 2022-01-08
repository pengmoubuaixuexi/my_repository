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
	container *p;             //���������ָ��p
	cube obj1(10);            //�������������obj1
	sphere obj2(6);            //�����������obj2
	cylinder obj3(4);        //����Բ�������obj3
	p=&obj1;                  //ָ��pָ�����������obj1
	cout<<"��������"<<endl;
	cout<<"   ������������"<<p->surface_area()<<endl;
	cout<<"   �����������  "<<p->volume()<<endl;
	p=&obj2;                   //ָ��pָ���������obj2
	cout<<"   ����ı������"<<p->surface_area()<<endl;
	cout<<"   ����������  "<<p->volume()<<endl;
	p=&obj3;                    //ָ��pָ��Բ�������obj3
	cout<<"   Բ��ı������"<<p->surface_area()<<endl;
	cout<<"   Բ��������  "<<p->volume()<<endl;
}
}
