#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
typedef struct {
	float shibu;
	float xubu;
}Complex;
void judge(Complex a);
void creatComplex(Complex &a,float shibu,float xubu);
void sumComplex(Complex &a , Complex b);
void subComplex(Complex &a , Complex b);
void multComplex(Complex &a , Complex b);
float getShibu(Complex a);
float Max(float a ,float b);
float Min(float a ,float b);
float getXubu(Complex a);
void divComplex(Complex &a , Complex b);
int n = 2;//精度用于所有比较除0以外的 
///////////////////////////////////////////////////
void creatComplex(Complex &a,float shibu,float xubu){
	a.shibu = shibu;
	a.xubu = xubu;
}
void printComplex(Complex a){
	judge(a);
}
void judge(Complex a){
	if (n==2){
	if (fabs(a.shibu)> 0){
		if (fabs(a.xubu)>0){
			if (a.xubu>0)
				printf("%.2f+i%.2f\n",a.shibu,a.xubu);
			else
				printf("%.2f-i%.2f\n",a.shibu,-a.xubu);
		}
		else 
			printf("%.2f",a.shibu);
	}
	else{
		if (fabs(a.xubu)> 0 ){
			if (a.xubu > 0)
				printf("i%.2f\n",a.xubu);
			else 
				printf("-i%.2f",-a.xubu);
		}
		else
			printf("0\n");
}}	
	else{
	if (fabs(a.shibu)> 0){
		if (fabs(a.xubu)>0){
			if (a.xubu>0)
				printf("%f+i%f\n",int(a.shibu*pow(10,n)+0.5)/pow(10,n),int(a.xubu*pow(10,n)+0.5)/pow(10,n));
			else
				printf("%f-i%f\n",int(a.shibu*pow(10,n)+0.5)/pow(10,n),-int(a.xubu*pow(10,n)+0.5)/pow(10,n));
		}
		else 
			printf("%f",int(a.shibu*pow(10,n)+0.5)/pow(10,n));
	}
	else{
		if (fabs(a.xubu)> 0 ){
			if (a.xubu > 0)
				printf("i%f\n",int(a.xubu*pow(10,n)+0.5)/pow(10,n));
			else 
				printf("-i%f",-int(a.xubu*pow(10,n)+0.5)/pow(10,n));
		}
		else
			printf("0\n");
}	
	}
}
void sumComplex(Complex &a , Complex b){
	a.shibu = a.shibu + b.shibu;
	a.xubu = a.xubu + b.xubu;
	judge(a);
}
void subComplex(Complex &a ,Complex b){
	a.shibu = a.shibu - b.shibu;
	a.xubu = a.xubu - b.xubu;
	judge(a);
}
void multComplex(Complex &a , Complex b){
	float temp = a.shibu;
	a.shibu = a.shibu*b.shibu - a.xubu*b.xubu;
	a.xubu = temp*b.xubu +a.xubu*b.shibu;
	if(fabs(a.shibu) <1.0/(pow(10,n)*100) && fabs(a.xubu) < 1.0/(pow(10,n)*100)){
		printf("0");
	}
}
float getShibu(Complex a){
	return a.shibu;
}
float getXubu(Complex a){
	return a.xubu;
}
float Max(float a ,float b){
	if (fabs(a)>fabs(b))
		return fabs(a);
	else
		return fabs(b);
}
float Min(float a ,float b){
	if (fabs(a)>fabs(b))
		return fabs(b);
	else
		return fabs(a);
}
void divComplex(Complex &a , Complex b, int n){
	float i,j,max,min,shangxian;
	Complex c,d;
	creatComplex(d,0,0);
	creatComplex(c,0,0);
	c.shibu = 1;
	max = Max(a.shibu,a.xubu);
	min = Min(b.shibu,b.xubu);
	shangxian = max/min;
	//看你想要多少的精度 
	for(i=0;i<=shangxian;i=i+1.0/pow(10,n)){//本来想用 i=i+1.0/pow(10,n)表示精度，但int类型导致无法实现 
		for(j=0;j<=shangxian;j=j+1.0/pow(10,n)){
			d.shibu = b.shibu;
			d.xubu = b.xubu;
			c.shibu = i; 
			c.xubu = j;
			if(i!=0||j!=0){
			multComplex(d,c);
			if (fabs(a.shibu - d.shibu )<0.001 && fabs(a.xubu - d.xubu) <0.001){
				a=c;
				judge(a);
				exit(1);
			}
			}
		}
	}
	printf("无a,b为小数点后%d位解的ai+bj能使得除式成立",n);
}
int main(){
	Complex a,b,c;
	creatComplex(a,-3.33,-2.15);
	creatComplex(b,4,1);
	printComplex(a);
	printComplex(b);
	sumComplex(a,b);
	subComplex(a,b);
	multComplex(a,b);
	judge(a);
	float a1,a2;
	a1 = getShibu(a);
	a2 = getXubu(a);
	printf("%.2f\n",a1);
	printf("%.2f\n",a2);
	printf("请输入你需要算的除法及其的精度以a b c d n输入\n");
	scanf("%f %f %f %f %d",&a.shibu,&a.xubu,&b.shibu,&b.xubu,&n);
	divComplex(a,b,n);
}
