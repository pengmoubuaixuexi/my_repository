#include <stdio.h>
#include <stdlib.h>
long filesize(FILE *stream);
int main()
{
    FILE *stream;
    char test[10];
    printf("\n test.txt\n");
    scanf("%s",&test);
    if((stream=fopen("F://test.txt","r"))==NULL)
    {
        printf("\n无法打开文件:%s\n",test);
        exit(0);
    }
    printf("%s的文件大小是%ld(byre)\n",test,filesize(stream));
    fclose(stream);
    return 0;
}
long filesize(FILE *fp)
{
    long curpos,length;
    curpos=ftell(fp);
    fseek(fp,0L,SEEK_END);
    length=ftell(fp);
    fseek(fp,curpos,SEEK_SET);
}
