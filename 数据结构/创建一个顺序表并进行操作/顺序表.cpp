#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define maxsize 100

typedef struct Sqlist{
	int *L;
	int length;
}; 
void initSqlist(Sqlist *p, int length){
	p->L = (int *)malloc(maxsize*sizeof(int));
	if(!p->L){
		printf("申请空间出错");
		exit(0); 
	}
	int *Q = p->L;
	int i;
	for(i=0;i<length;i++){
		printf("请输入第%d个数据的基本元素\n",i+1) ;
		scanf("%d",Q++);
	}
	p->length = length;
} 
void print(Sqlist *p){
	int i;
	int *Q = p->L;
	for(i=0;i<p->length;i++){
		printf("%d ",*(Q++));
	}
	printf("\n");
}
//如果输入的是非递减的顺序表，按大小插
void insert(Sqlist *p,int e){
	int i,j;
	for(i=0;i<p->length;i++){
		if (i==p->length-1){
			p->L[p->length] = e;
		}
		if (e>=p->L[i]&&e<=p->L[i+1]){
			for(j=p->length;j>i+1;j--){
				p->L[j] = p->L[j-1];
			}
			p->L[i+1] = e;
			break; 
		}
	}
	p->length++;
} 
//插在最后 
void insert1(Sqlist *p,int e){
	if(p->length == maxsize){
		printf("空间分配异常");
		exit(0);
	}
	p->L[p->length] = e;
	p->length++;
}
// 随便找位置插,插在那里e就是第几个元素 
void insert2(Sqlist *p,int e,int weizhi){
	if(weizhi>=p->length||weizhi<=0){
		printf("位置输入异常");
		exit(0);
	}
	if(p->length == maxsize){
		printf("空间分配异常");
		exit(0);
	}
	int temp,i;
	temp = p->L[weizhi-1];
	for(i=p->length;i>=weizhi;i--){
		p->L[i] = p->L[i-1];
	}
	p->L[weizhi-1] = e;
	p->length++;
} 
//第几个就从第几个删，比如 1 3 5 7 9 输入2 3变成1 9 
void deleteelem(Sqlist *p,int weizhi, int k){
	int i;
	if(weizhi>p->length||weizhi<=0){
		printf("位置输入异常");
		exit(0); 
	}
	if(weizhi+k<p->length){
		for(i=weizhi;i<p->length;i++){
			p->L[i-1] = p->L[i+k-1];
	    }
		p->length = p->length-k;
	}
	else{
		p->length = weizhi-1;
	}
} 
void nixuSqlist(Sqlist *p){
	int i,temp;
	for(i=0;i<p->length/2;i++){//除2，如果偶数刚好两边交换，奇数除了中间以外两边交换。 
		temp = p->L[i];
		p->L[i] = p->L[p->length-1-i];
		p->L[p->length-1-i] = temp;
	}
}
int main(){
	Sqlist p;
	int length = 5,a,b;
	initSqlist(&p,length);
	print(&p);
	insert(&p,3);
	print(&p);
	insert1(&p,4);
	print(&p);
	printf("请输入你要插入的数据及位置\n");
	scanf("%d %d",&a,&b);
	insert2(&p,a,b);
	print(&p);
	printf("请输入你要从第几个数据开始删几个数据\n");
	scanf("%d %d",&a,&b);
	deleteelem(&p,a,b);
	print(&p);
	nixuSqlist(&p);
	print(&p);
}
