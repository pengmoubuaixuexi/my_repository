#include<stdio.h>

#include<math.h>

int main ()

{

    int x,y,z;

    for(x=1;x<=100;x=x+2)

    {

        y=sqrt(x);

        for(z=2;z<=y;z++)

            if(x%z==0)

            break;

            if(z>=y+1)



            printf("%d ",x);



    }

}
