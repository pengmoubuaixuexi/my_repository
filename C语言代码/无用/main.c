#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *fp;
    char string[81];
    if((fp=fopen("test.txt","wt"))==NULL)
    {
        printf("cannot open this file.\n");
        exit(0);
    }
       while(gets(string)!=NULL)
        {
            fputs(string,fp);
            fputc('\n',fp);
        }
        fclose(fp);
        return 0;
}
