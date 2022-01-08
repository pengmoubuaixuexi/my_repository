#include<stdio.h>
int main()
{
	int x,y,z=100;
	printf("shu ru x:\n");
	scanf("%d",&x);
	for(y=0;y<=7;y++)
	{
	z=z/2;
	if(x>=z)
	{
	x=x-z;
	printf("hr1");
	}else
	{
	x=x-z/2;
	printf("hr2");
	}}return 0; 
 } 
