Status SelfLearning_Locate(DuCycle_List &L,ElemType e)
{
	DuCycle_Lnode *p, *q;
	p = NULL;
	q = L->next;
	while (q->next!=L&&q->data!=e)
	{
		q = q->next;
	}
	if (q->data == e)
	{
		q->freq++;
		p = q->prior;
		while (p!=L&&p->freq<q->freq)
		{
			p = p->prior;
		}
		q->next->prior = q->prior;
		q->prior->next = q->next;
		q->next = p->next;
		p->next->prior = q;
		p->next = q;
		q->prior = p;
		printf("element found.\n");
		return OK;
	}
	printf("element not found.\n");
	return ERROR;
}
