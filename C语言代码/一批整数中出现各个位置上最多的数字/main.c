#include <stdio.h>
#include <stdlib.h>
int f(int b[]);
int main()
{
    int n;
    printf("�����뼸������\n");
    scanf("%d",&n);
    int a[n],b[n],i;//b[]���Լ����������
    printf("��������������м��ÿո�����\n");
    //iΪ���ֳ��ִ���
        for(i=0;i<n;i++){
        scanf("%d",&b[i]);
            f();
}}
int f(int b[i])
{
    int m,a[10],z,y,x;
    for(i=0;i<10;i++){
        a[i]=0;}
    for(m=0;m<4;m++)
        x=b[i]%10;
        a[x]++;
        x=b[i]/10%10;
        a[x]++;
        x=b[i]/100%10;
        a[x]++;
        x=b[i]/1000%10;
        a[x]++;
        for(z=0;z<9;z++){
            if(a[z]>a[z+1])
            y=a[z];
        else if(a[z]<a[z+1])
            y=a[z+1];}

            printf("%d",y);
            printf("%d",z)

}
