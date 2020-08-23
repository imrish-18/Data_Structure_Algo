
#include<stdio.h>

struct queue
{

int size;
int *arr;
int front ,rear;
};

struct queue* createQueue(int size)
{
   struct queue *temp;
   temp=malloc(sizeof(struct queue));
   temp->arr=malloc(sizeof(int)*size);
   temp->front=-1;
   temp->rear=-1;
   return temp;

}

void e_queue(struct queue *q,int data)
{

    if((q->rear+1)%q->size==q->front)
    {

        printf("queue is full....\n");

    }
    else if(q->front==-1)
    {
        q->front=0;
        q->rear=(q->rear+1)%q->size;
        q->arr[q->rear]=data;


    }
    else
        {

        q->rear=(q->rear+1)%q->size;
        q->arr[q->rear]=data;
    }
}

void d_queue(struct queue *temp)
{

 while(temp->front!=temp->rear+1)
 {
     printf("%d\n",temp->arr[temp->front]);
     temp->front++;
 }

}


void display(struct queue *temp,int size)
{
    int k=0;
    while(temp->front!=size)
{

    printf("%d\n",temp->arr[k++]);
    size--;
}


}

int main()
{

int size,data,k=0;
struct queue *temp;
printf("please enter the size of the queue");
scanf("%d",&size);
temp=createQueue(size);
for(int i=0;i<5;i++)
{
    scanf("%d",&data);
      e_queue(temp,data);

}
printf("entered data in queue are....\n");
display(temp,size);
d_queue(temp);

}
