#include <stdio.h>
#include <stdlib.h>
void main()
{
    int a=1,b=2;
    f(&a,&b);

    printf("%d %d",a,b);
    return 0;
}
void f(int *a,int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;

}
