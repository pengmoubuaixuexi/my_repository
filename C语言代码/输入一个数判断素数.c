#include<stdio.h>
#include<math.h>
int main()
{
	int a,b;
	printf("��������Ҫ�жϵ���");
	scanf("%d",&a);
	for(b=2;b<=sqrt(a);b=b+1)
	if(a%b==0)
    break;
	if(b==sqrt(a))
    printf("����������"); 
	return 0;
 }
