#include<stdio.h>;
int main()
{
	int x;
	printf("���������X:");
	scanf("%d",&x);
	if (x<1900&&x>2100)
	{
		printf("�������������x:");
		scanf("%d",&x);	
	}
	else if(x%100==0&&x%400==0)
	{
		printf("%d������",x);
	}
	else if (x%100==0&&x%400!=0)
		printf("%d��������",x);
	else if(x%100!=0&&x%4==0)
		printf("%d������",x);
	else
		printf("%d��������",x);

 } 
