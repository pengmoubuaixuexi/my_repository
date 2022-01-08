#include<stdio.h>
int main()
{
double x,y;
printf("«Î ‰»Îx£∫\n");
scanf("%d",&x);
if(x<1)
y=x;
else if(1<=x<10)
y=2*x-1;
else if(x>=10)
y=3*x+12;
printf("%lf",y);
 } 
