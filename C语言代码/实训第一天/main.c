#include <stdio.h>
#include <stdlib.h>

int main()
{
    int N,M,i,j;
    scanf("%d %d",&N,&M);
    int a[N];
    for(i=0;i<N;i++){
        scanf("%d",&a[i]);
    }
    int min = 0;
    for(j=M;j<N;j++){
    for(i=0;i<M;i++){
        if(a[min]>a[i]){
            min = i;
            }
        }
        a[min]= a[min]+a[j];
    }
    int max = a[0];
    for(i=0;i<M;i++)
        if(max<a[i])
            max = a[i];
        printf("%d",a[min]);
}
