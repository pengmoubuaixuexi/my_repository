#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a[3],*p,i=0,z=0;
    for(i=0;i<3;i++)
{
    printf("shuru chengji :\n");
    scanf("%d",&a[i]);
    p=&a[i];
    z=z+*p;
}
    printf("%d\n",z);
    z=z/i;
    printf("%d",z);
    return 0;
}
