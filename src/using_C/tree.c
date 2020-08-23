#include<stdio.h>
struct node
{

    int data;
    struct node *rptr;
    struct node *lptr;

};
struct queue
{

int size;
struct node** arr;
int front ,rear;
};

struct queue* createQueue(int size)
{
   struct queue *temp;
   temp=malloc(sizeof(struct queue));
   temp->arr=malloc(sizeof(int)*size);
   temp->front=-1;
   temp->rear=-1;
   temp->size=size;
   return temp;

}

struct   node* createTree(int data)
   {
       struct  node *temp;
       temp=malloc(sizeof(struct node));
       temp->data=data;
       temp->lptr=NULL;
       temp->rptr=NULL;
       return temp;
   }


   void e_queue(struct node *temp,struct queue *q)
{
    if((q->rear+1)==q->size)
    {

        printf("queue is full....\n");

    }
    else if(q->front==-1)
    {
        q->front++;
        q->rear=(q->rear+1)%q->size;
        q->arr[q->rear]=temp;


    }
    else
        {

        q->rear=(q->rear+1)%q->size;
        q->arr[q->rear]=temp;


    }
}

struct node* d_queue(struct queue *temp,struct node *root)
{

 if(temp->front==temp->rear+1)
    return NULL;
 else
 {

     return temp->arr[temp->front++];

 }
}
int isFull(struct queue *q)
{

    if(q->rear+1==q->size)
        return 1;
    else
        return 0;
}
void inorder(struct node *p){
    if (p){
    inorder(p->lptr);
     printf("%d\n",p->data);
        inorder(p->rptr);
    }
}
int main()
{
int size,data;
struct queue *q;
struct node *root,*p;
printf("enter the size of the queue..\n");
scanf("%d",&size);
q=createQueue(size);
printf("enter the data into root node..\n");
scanf("%d",&data);
root=createTree(data);
e_queue(root,q);

while(!isFull(q))
{

p=d_queue(q);
if(p->lptr==NULL)
{
    scanf("%d",&data);
    p->lptr=createTree(data);
    e_queue(p->lptr,q);

}
if(p->rptr==NULL)
    {
     scanf("%d",&data);
    p->rptr=createTree(data);
    e_queue(p->rptr,q);
}

}



//inorder(root);
}

