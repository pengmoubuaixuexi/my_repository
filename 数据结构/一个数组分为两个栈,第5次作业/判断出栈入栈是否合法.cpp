#include <stdio.h>
#include <stdlib.h>
bool judge(char a[],int n){
	int i;
	int num=0;
	for(i=0;i<n;i++){
		if(a[i]=='I'){
			num++;
		}
		if(a[i]=='O'){
			num--;
		}
		if(num<0) return false;
	}
	if(num!=0) return false;
	return true;
}
int main (){
	char a[] = {'O','I','I','O'};
	if(judge(a,4)) printf("合法");
	else printf("不合法"); 
}
