#include<stdio.h>
struct node
{

    int data;
struct     node *ptr;
};
struct node *start=NULL;
struct node* createNode(int data)
 {

     struct node *temp;
     temp=malloc(sizeof(struct node));
     temp->data=data;
     temp->ptr=NULL;
     return temp;
 }

 void insertNode(int data)
 {
     struct node *flag;

      if(start==NULL)
        start=createNode(data);
      else{
               flag=start;
        while(flag->ptr!=NULL)
        {

            flag=flag->ptr;
        }
        flag->ptr=createNode(data);
      }
}

 void deleteFirstNode()
 {
     struct node *n;
     n=start;
     start=n->ptr;
     n=NULL;

 }

 void lastNodeDelete()
 {
     struct node *n,*temp;
     n=start;
     while(n->ptr!=NULL)
     {
         temp=n;
        n=n->ptr;
     }
     temp->ptr=NULL;
     n=NULL;
 }
 void reverseList()
 {
     struct node *q,*p,*r;
     p=start;
     while(p!=NULL)
     {
         r=q;
         q=p;
         p=p->ptr;
         q->ptr=r;

     }

 }

 int main()
 {

     struct node *n;
     int count=0;
     n=start;
     int data;
     printf("enter the data into linkedList");
     for(int i=0;i<3;i++)
     {
     scanf("%d",&data);
    insertNode(data);
     }
     // deleteFirstNode();
      //lastNodeDelete();
      reverseList();
     while(start->ptr!=start){
     printf("data is  %d\n",start->data);
     count++;
     start=start->ptr;
     }
     printf("%d",count);
     return 0;
 }
