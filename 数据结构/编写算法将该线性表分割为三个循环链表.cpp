//��֪��һ�����������ʾ�����Ա��к��������ַ�������Ԫ�أ��磺��ĸ�ַ��������ַ��������ַ������Ա�д�㷨�������Ա�ָ�Ϊ����ѭ����������ÿ��ѭ�������ʾ�����Ա��о�ֻ��һ���ַ���
void divlist(list p){//���Ǵ���ͷ���ı� 
list a = new list;
list b = new list;
list c = new list;
list a1=a,b1=b,c1=c;
l = p->next;
while(l){
	if(l->element == element1){
		a1->next = l;
		a1 = a1->next
	}
	if(l->element == element2){
		b1->next = l;
		b1 = b1->next;
	}	
	if(l->element == element3){
		c1->next = l;
		c1 = c1->next;
	}
	l = l->next;
}
a1->next = a;
b1->next = b;
c3->next = c;
} 
//��дһ�㷨��ɾ��Ԫ�طǵݼ����еĵ�����L������ֵ��ͬ��Ԫ�ء�����ͬԪ��ֵֻ����һ����
void deleteelement(LinkList &p){
	LinkList L = p->next;
	while(L->next){
		if(L->element==L->next->element){
			LinkList Q = L->next;
			L->next = L->next->next;
			free(Q);
		}
		else{
		L = L->next; 
		}
	}
} 
//ʵ�ֵ������ϵ�ð������
void maopaosortedd(LinkList &p){
	LinkList L = p->next;
	int count=1,i,j;
	while(L->next){
		L = L->next
		count++;
	}
	for(i=0;i<count-1;i++){
		L = p->next;
		LinkList Q = p;
		LinkList R = L->next;
		for(j=0;j<count-1-i;j++)
			if(R->element<L->element){
				Q->next = R;
				L->next = R->next;
				R->next = L;
				q = q->next;
				R=L->next;
			}
			else{
				R = R->next;
				L = L->next;
				Q = Q->next;
			}
	}
}
//˫������ 
void Locate(DuLinkList &p,int weizhi){
	DuLinkList L = p;
	DuLinkList Q = p->next;
	for(i=0;i<weizhi;i++){
		L = L->next;
	}
	L->freq++;
	while(Q!=L){
		if(Q->freq>=L->freq&&Q->next->freq<L->freq){
			L->next->pre = L->pre;
			L->pre->next = L->next;
			L->next = Q->next;
			L->pre = Q;
			Q->next = L;
			L->next->pre = L; 
		}
		else{
			Q=Q->next;
		} 
	}
} 
