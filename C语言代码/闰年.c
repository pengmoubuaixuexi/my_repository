#include<stdio.h>;
int main()
{
	int x;
	printf("请输入年份X:");
	scanf("%d",&x);
	if (x<1900&&x>2100)
	{
		printf("请重新输入年份x:");
		scanf("%d",&x);	
	}
	else if(x%100==0&&x%400==0)
	{
		printf("%d是闰年",x);
	}
	else if (x%100==0&&x%400!=0)
		printf("%d不是闰年",x);
	else if(x%100!=0&&x%4==0)
		printf("%d是闰年",x);
	else
		printf("%d不是闰年",x);

 } 
