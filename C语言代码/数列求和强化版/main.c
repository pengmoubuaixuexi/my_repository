#include <stdio.h>
#include <stdlib.h>
//给定某数字A（1≤A≤9）以及非负整数N（0≤N≤100000），求数列之和S=A+AA+AAA+⋯+AA⋯A（N个A）。例如A=1, N=3时，S=1+11+111=123。
int main()
{
    int a,n,s=0,i,b[10];
    printf("qingshurusuzi:\n");
    scanf("%d",&a);
    printf("qingshurugeshu:\n");
    scanf("%d",&n);
    b[0]=a;
    for(i=1;i<n;i++){
        b[i]=10*b[i-1]+b[0];
        }
    for(i=n-1;i>=0;i--){
        s=s+b[i];}
        printf("%d\n",s);}
