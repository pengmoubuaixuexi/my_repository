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
        m++;}
    int a,b,z;
    for(a=2;a<=n/2;a++){
            if (isprime(a))
            continue;
        for(b=2;b<=n/2;b++){
             if (isprime(b))
            continue;
                if(n==b+a)
                printf("n=a+b¼´%d=%d+%d\n",n,a,b);
}}}}

