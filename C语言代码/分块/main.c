#include <stdio.h>
#include <stdlib.h>
#include<funB.h>
#include<funA.h>


int main()
{
    int a,b;
    printf("������a,b\n");
    scanf("%d %d",&a,&b);
    funA(a,b);
    funB();
    return 0;
}
