#include <stdio.h>
#include <stdlib.h>
#include<time.h>
#include<math.h>
int isprime(int num)
{int flag=1;
int c;
for(c=2;c<=sqrt(num);c++)
    if(num%c==0)
    flag=0;
return flag;
}
int main()
{
    int n,m=0;
    srand(time(0));
    while(m<=1000){
    int n=rand();
    if(n%2==0)
        {n=n%10000;
        m++;
		printf("%d\n",m);}
    int a,b,m;
	for(a=2;a<n-1;a++)
                if(isprime(a)&&isprime(n-a))
                printf("n=a+b¼´%d=%d+%d\n",n,a,n-a);
                
}}


