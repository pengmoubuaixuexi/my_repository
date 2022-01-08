#include "stdio.h"
#include<math.h>
 int IsPrime(int num);
 int main()
 { 
 int num,m,n,a,b,z;
  int j;
  int count; 
 //m=n+10; 
   for(a=0;a<=10000;a++)
  { 
  m=a; 
  count=0;
   for(b=m;b<m+10;b++) 
  for(z=2;z<sqrt(b);z++)
   if(!IsPrime)  
     count++; 
  		if(count==10){  
  		  
 				printf("%d ",m);  
  		 			m++;}  
  } }
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
