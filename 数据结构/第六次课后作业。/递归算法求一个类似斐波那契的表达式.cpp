#include <string.h>
#include <stdio.h>
#include <stdlib.h> 
float F(int n){
 	if(n==0)
 		return 1;
 	else
 		return n*F(n/2); 
 }
 int main(){
 	int n;
 	scanf("%d",&n);
 	printf("%.2f",F(n));
 }
