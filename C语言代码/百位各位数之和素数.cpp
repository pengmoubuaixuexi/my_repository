#include<stdio.h>
#include<stdlib.h>
int main()
{
int x,y,z,m,n,l,h=1;
for(x=101;x<1000;x++)
{
y=x%10;
z=x%100/10;
m=x/100;
n=y+z+m;
for(y=2;y<n;y++)
{
if (n%y==0)
{
h=0;
break;
}
}
if(h==1)
printf("%d\n",x);
h=1;
}
return 0;
}
