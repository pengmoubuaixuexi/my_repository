#include <stdio.h>
#include <stdlib.h>
int ji(int a);
int main()
{
    int n,a,b,x=0;
    printf("����������Ҫ���Լ�����");
    scanf("%d",&n);
    for(a=0;a<n;a++){
        printf("��������Ҫ�����͵��Ǽ�����");
        scanf("%d",&b);
        if(ji(b)!=1)
            x=x+ji(b);
}
            printf("%d ",x);

}
int ji(int a)
{
    if(a%2==0)
        return 1;
    else if(a%2!=0)
        return a;
}
