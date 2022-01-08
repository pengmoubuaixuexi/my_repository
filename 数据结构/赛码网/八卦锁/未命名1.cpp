#include <stdio.h>
#include <stdlib.h>
int main(){
    int n,i,j,k,count=0;
    scanf("%d",&n);
    int A[n];
    for(i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    for(i=0;i<n-2;i++){
        for(j=i+1;j<n-1;j++){
            for(k=j+1;k<n;k++){
                if (A[i]<A[j]&&A[j]>A[k]){
                    count++;
                }
            }
        }
    }printf("%d",count) ;
}
