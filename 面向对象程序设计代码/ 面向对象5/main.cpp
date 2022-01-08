#include <iostream>
#include <math.h>
using namespace std;
int isprime(int n);
int main()
{
    int n,i;
    cout<<"输入个数"<<endl;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++){
        cout<<"输入是多少"<<endl;
        cin>>a[i];}
    int b[n],m=0;//储存素数的数组
    for(i=0;i<n;i++){
        if(isprime(a[i])){
            b[m]=a[i];
            m++;}
        else
            m=m;}
    float s=0.0,c=0.0/*计数*/;
    for(i=0;i<0;i++){
        if(b[i]!=0)
          s=s+b[i];
        else
            break;}
    float q;
        q=s/c;
        cout<<q;
}

int isprime(int n)
{
    int flag=1,i;
    for(i=2;i<=n;i++)
    if(n%i==0)
        flag=0;
    return n;
}
