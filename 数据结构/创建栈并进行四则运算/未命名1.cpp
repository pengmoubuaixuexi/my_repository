#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <malloc.h>
typedef struct StackInt{
	StackInt *next;
	int data;
};
typedef struct StackChar{
	StackChar *next;
	char data;
};
void initStack(StackInt *p){
	p = NULL;
}
void initStack(StackChar *p){
	p = NULL;
}
void push(StackInt *p,int e){
	StackInt *Q = new StackInt;
	Q->data = e;
	Q->next = p;
	p = Q;
}
void push(StackChar *p,char e){
	StackChar *Q = new StackChar;
	Q->data = e;
	Q->next = p;
	p = Q;
}
int pop(StackInt *p){
	if(!p) return 0;
	StackInt *Q = p;
	int a = p->data;
	p = p->next;
//	free(Q);
	return a;
}
char pop(StackChar *p){
	if(!p) return '0';
	StackChar *Q = p;
	char a = p->data;
	p = p->next;
//	free(Q);
	return a;
}
bool isnumpty(StackInt *p){
	if(p) return false;
	else return true;
}
bool isnumpty(StackChar *p){
	if(p) return false;
	else return true;
}
//int popint(StackChar *p,int e){
//	p->
//}
int main(){
	StackChar p;
	initStack(&p);
	push(&p,'Q');
	printf("%c",p.data);
	char a = pop(&p);
}
