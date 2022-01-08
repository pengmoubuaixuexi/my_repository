#include <stdio.h>
#include <math.h>
 
int number;
int Firstnum;
int Secondnum;
 
int  main()
{
	int x,y;
	int Temp;
	printf("Please input Number\n");
	scanf("%d",&number);
	for(x=2;x<number/2;x++)
	{
		Firstnum =x;
		Temp =sqrt(Firstnum)+1;
		for(y=2;y<Temp;y++)
		{
			if(Firstnum % y == 0 )
			{
				Firstnum = 0;
				break;
			}
		}
		Secondnum=number-x;
		Temp=sqrt(Secondnum)+1;
		for(y=2;y<Temp;y++)
		{
			if(Secondnum % y == 0)
			{
				Secondnum = 0;
				break;
			}
		}
		if(Firstnum&&Secondnum)
			printf("%d = %d + %d\r\n",number,Firstnum,Secondnum);
		
	}
	return 0;
}
