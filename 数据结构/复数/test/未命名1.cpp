#include <stdio.h>
#include <stdlib.h>
typedef struct{
   float r;
   float i;
}complex;
void creat (complex *c)
{
    printf("请输入\n");
    scanf("%f %f",&c->r,&c->i);
}
float getreal(complex c)
{
    return c.r;
}
float getimage(complex c)
{
    return c.i;
}
complex add(complex c1,complex c2)
{
    complex sum;
    sum.r=c1.r+c2.r;
    sum.i=c1.i+c2.i;
    return sum;

}
int main()
{
    complex c1,c2,sum;
    creat(&c1);
    creat(&c2);
    sum=add(c1,c2);
    if(sum.i>0)
    {
        printf("\n加法：%.2f+%.2f",sum.r,sum.i);
    }
    else if(sum.i==0)
        printf("\n加法:%.2f",sum.r);
    else
        printf("\n加法:%.2f",sum.r,sum.i);

}

