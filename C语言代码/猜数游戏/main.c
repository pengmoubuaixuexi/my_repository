#include<stdio.h>
#include<stdlib.h>
#include<time.h>
    int main()
{
    int x,n=0,m;
    srand((unsigned)time(0));
    m=rand()%100;
    printf("偷偷告诉你答案%d\n",m);
    while(1)
{   n=n+1;
    printf("请输入您猜的数字\n");
    scanf("%d", &x);
    if(x==-1)
{       printf("不会吧，你选择放弃，请你再次确认\n");
    scanf("%d",&x);
    if(x==-1){
        printf("尊重你的选择");
        break;}
    else
        continue;
        }
    if (x > m) {
        printf("高了\n");
}
    else if (x < m) {
        printf("低了\n");
}
    else{
        printf("猜对了\n");
    if(n<5&&n>=0)
        printf("太强了");
    if(n>=5&&n<=8)
        printf("一般般");
    if(n>8)
        printf("但是太菜了");
        break;
}
}
}
