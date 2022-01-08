#include<stdio.h>

int main()
{
    float x,y;
    printf("please input a x\n");
    scanf("%f",&x);
    if(x<1)
	y=x;
    else if(1<=x<10)
	y=2*x-1;
    else if(x>=10)
	y=3*x+11;
  printf("%f",y);
}
    

