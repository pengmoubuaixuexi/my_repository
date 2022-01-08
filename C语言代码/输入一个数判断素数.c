#include<stdio.h>
#include<math.h>
int main()
{
	int a,b;
	printf("请输入你要判断的数");
	scanf("%d",&a);
	for(b=2;b<=sqrt(a);b=b+1)
	if(a%b==0)
    break;
	if(b==sqrt(a))
    printf("次数是素数"); 
	return 0;
 }
