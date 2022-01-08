#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void Intersection(int *A,int *B,int*C,int Asize,int Bsize,int *Csize)
{
    int i,j,n=0;
    for(i=0;i<Asize;i++){
        for(j=0;j<Bsize;j++){
            if((*(A+i)-*(B+j))==0){
                *(C+n) = *(A+i);
                    n++;
       }
        }}
        *Csize = n;
}
void display(int *T,int p)
{
    int i;
    printf("%d",p);
    if(p>0)
    {
        for(i=0;i<p-1;i++)
            printf(" %d",T[i]);
        printf(" %d\n",T[i]);
    }
}
void read(int *B,int size)
{
    int i;
    for(i=0;i<size;i++)
        scanf("%d",&B[i]);
}
int main()
{
    int a[100],b[100],c[200];
    int m,n,o=0;
    scanf("%d",&m);
    read(a,m);
    scanf("%d",&n);
    read(b,n);
    Intersection(a,b,c,m,n,&o);
    display(c,o);
    return 0;
}

