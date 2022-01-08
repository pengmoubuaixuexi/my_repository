#include <iostream>
using namespace std;
//两个数组，第二个数组是原始数组的同一位置与前一个后一个的平均值
int main()
{
    float a[10],b[10];
    a[0]=0;a[1]=3;a[2]=6;a[3]=9;a[4]=12;
    a[5]=15;a[6]=18;a[7]=21;a[8]=24;a[9]=27;
    int i=0,m;
    for(i=0;i<10;i++){
            if(i==9)
            m=0;
            else
            m=i+1;
        b[i]=((a[i]+a[i-1]+a[m])/3.0);
        cout<<"a"<<a[i]<<" "<<endl;
        cout<<"b"<<b[i]<<" "<<endl;
}}
