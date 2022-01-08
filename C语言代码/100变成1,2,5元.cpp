#include <stdio.h>
#include <math.h>
int main()
{
    int x,y,z,m=0;
    for(x=0;x<=100;x++)
    for(y=0;y<=50;y++)
    for(z=0;z<=20;z++)
    if(x+2*y+5*z==100)
            {
			printf("%d一元 %d两元 %d五元\n",x,y,z);
            m++;
		}
		printf("\n有多少种",m);
    return 0;
}



