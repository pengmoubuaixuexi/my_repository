#include<stdio.h>
#include<stdlib.h>
#include<time.h>
    int main()
{
    int x,n=0,m;
    srand((unsigned)time(0));
    m=rand()%100;
    printf("͵͵�������%d\n",m);
    while(1)
{   n=n+1;
    printf("���������µ�����\n");
    scanf("%d", &x);
    if(x==-1)
{       printf("����ɣ���ѡ������������ٴ�ȷ��\n");
    scanf("%d",&x);
    if(x==-1){
        printf("�������ѡ��");
        break;}
    else
        continue;
        }
    if (x > m) {
        printf("����\n");
}
    else if (x < m) {
        printf("����\n");
}
    else{
        printf("�¶���\n");
    if(n<5&&n>=0)
        printf("̫ǿ��");
    if(n>=5&&n<=8)
        printf("һ���");
    if(n>8)
        printf("����̫����");
        break;
}
}
}
