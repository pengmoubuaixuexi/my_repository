#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int N,i;
    float M;
    scanf("%d %f",&N,&M);
    float P[N];
    for(i=0;i<N;i++){
        scanf("%f",&P[i]);
        }
        for(i=0;i<N;i++){
        if(P[i]<M){
            printf("On Sale!%f\n",P[i]);
    }}

}
