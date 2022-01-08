#include <stdio.h>
#include <stdlib.h>
#define SQ(x) x*x
#define QQ(x,y) SQ(x)-SQ(y)
int main()
{
    int a,b;
    a=QQ(6,2+3);//36+7=43;36+10=46
    b=QQ(6,0+5);
    printf("%d",b);
    printf("%d",a);
}
