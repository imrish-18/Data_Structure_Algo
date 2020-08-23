#include<stdio.h>
struct stack
{
    int *arr;
    int size;
    int top;
};

struct stack* createStack(int size)
{

    struct stack *temp;
   temp=malloc(sizeof(struct stack));
   temp->arr=malloc(sizeof(int)*size);
   temp->size=size;
   temp->top=-1;
   return temp;

}
void  push(struct stack *st,int data)
{
    if(st->top==-1)
    {
       // printf("stack is empty  added the values to stack");
        st->top++;
        st->arr[st->top]=data;



    }
    else if(st->top!=st->size-1)
    {
        st->top++;
        st->arr[st->top]=data;



    }
    else
    {
        printf("stack is overflow");

    }

}
void pop(struct stack *st)
{
    while(st->top!=-1)
    {                printf("data is %d\n",st->arr[st->top]);
                st->top--;
    }

}

int main()
{

    struct stack *temp;
    int size,data;
    printf("enter the size of the stack");
    scanf("%d",&size);
    temp=createStack(size);
      while(size!=0)
      {
          scanf("%d",&data);
          push(temp,data);
          size--;
      }
      for(int i=0;i<5;i++){
      printf("data is %d\n",temp->arr[i]);
      }
      printf("data is pop out from stack\n");
      pop(temp);
}
