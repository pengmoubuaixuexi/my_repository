#include<iostream>
using namespace std;
class Array{
	int *p;
	int n;
public:
	Array()	{	p=0;n=0; }
	Array(Array &t)
	{	n=t.n;		p=new int[n];
		for(int i=0;i<n;i++) p[i]=t.p[i];
	}
	Array(int pp[],int m)
	{	n=m;		p=new int[n];
		for(int i=0;i<n;i++) p[i]=pp[i];
	}
	Array & operator=(Array &t)
	{	n=t.n;
		if(p)delete []p;
		if(t.p){
			p=new int [n];
			for(int i=0;i<n;i++) p[i]=t.p[i];
		}
		else p=0;
		return *this;
	}
	void print()
	{	for(int i=0;i<n;i++)	cout<<p[i]<<'\t';
		cout<<endl;
	}
	Array operator++()
	{	for(int i=0;i<n;i++) ++p[i];
		return *this;
	}
	Array operator++(int)
	{	Array ar=*this;   				//A
		++(*this);
		return ar;
	}
	friend Array operator--(Array &t)
	{	for(int i=0;i<t.n;i++)  --t.p[i];
		return t;
	}
	friend Array operator--(Array &t,int)
	{	Array ar=t;
		--t;
		//for(int i=0;i<t.n;i++)--t.p[i];
		return ar;
	}
	~Array(){if(p)delete []p;}
};
int main()
{
	int a[]={1,2,3,4,5,6,7};
	Array arr(a,7);
	arr.print();
	ar=++arr;
	ar.print();
	arr.print();
	ar=arr++;	ar.print();		arr.print();
	ar=--arr;	ar.print();		arr.print();
	ar=arr--;	ar.print();		arr.print();
}
