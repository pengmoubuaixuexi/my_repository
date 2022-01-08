#include <iostream>
#include <string.h>
using namespace std;
    int main()
{
    char s[17]={3,4,0,5,2,4,8,0,0,1,0,1,0,0,1},x[]={1,0,'X',9,8,7,6,5,4,3,2};
    int w[17],i=0,c[17];
    for(i=0;i<17;i++){
        w[i]=s[i];}
    for(i=7;i<15;i++)
        {w[i+2]=s[i];}
        w[7]=1;
        w[8]=9;
    int S=0,a,Y;
    char y[]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
    for(i=0;i<17;i++){
        S=s[i]*w[i];}
        Y=S%11;
        a=x[Y];
    for(i=0;i<17;i++){
        cout<<w[i];}
        if(i=16)
            cout<<a<<endl;
        return 0;


}
