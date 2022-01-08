#include "stdio.h"
#include<math.h>
 int IsPrime(int num);
 int main()
 {
 int m,n,a,b,x;
  int j;
  int count;
   for(a=0;a<=10000;a++){
        m=a;
        count=0;
        for(b=m;b<m+10;b++){
            if(!IsPrime(b))
                count++;
            if(count==10){
                    for(x=1;x<=9;x++)
                        printf("%d ",a+x-1);
                    printf("\n");
  }}}
  return 0;
 }
int IsPrime(int num)
{ int flag=1;
 int c;
 for(c=2;c<=num/2;c++)
   if (num%c==0)
flag=0;
return flag;
}
