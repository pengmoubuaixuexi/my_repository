#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int f(int a,int b);
int main()
{
    int n,m,c;
    printf("请你输入范围\n");
    scanf("%d %d",&n,&m);
    c=f(n,m);
    printf("%d",c);
}

int f(int a,int b)
{
    int x,n=0;
    double z;
    for(x=a;x<=b;x++){
        z=sqrt(x);
        if(z-(int)z==0){
                int m,j,k;
                m=x/100;//百位数
                j=x/10%10;//十位
                k=x%10;//个位
            if(k==m||k==j){
                n=n+1;
                }
                else
                    n=n;
                }
                else
                    n=n;}
                return n;
}
