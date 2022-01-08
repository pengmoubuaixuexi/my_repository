#include<iostream>
#include<string.h>
using namespace std;
class STR{
	char s1[80],s2[80],s3[160];
public:
	STR(char a[],char b[]);
void consort();
	void show(){cout<<s1<<'\n'<<s2<<'\n'<<s3<<'\n';}
};
STR::STR(char a[],char b[]){
	strcpy(s1,a);
    strcpy(s2,b);
}
void STR::consort(){
	char t;
	strcpy(s3,s1);	strcat(s3,s2);
	char *p=s3;
	while(*p){
      p++;}
	for(char *p1=s3;p1<p;p1++)
		for(char *p2=p1+1;*p2;p2++)
			if(*p1>*p2){
	       t=*p1;*p1=*p2;*p2=t;
			}
}
int main(){
	char a[80],b[80];
	cin.getline(a,79);
	cin.getline(b,79);
	STR str(a,b);
	str.consort();
	str.show();
}
