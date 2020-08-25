#include<stdio.h>
struct node{
int key;
struct node *left;
struct node *right;
};


struct node* create_Node(int item)
{
    struct node *temp =  (struct node *)malloc(sizeof(struct node));
    temp->key = item;
    temp->left = temp->right = NULL;
    return temp;
}
struct node* insert(struct node* node, int key)
{
    /* If the tree is empty, return a new node */
    if (node == NULL) return create_Node(key);

    /* Otherwise, recur down the tree */
    if (key < node->key)
        node->left  = insert(node->left, key);
    else if (key > node->key)
        node->right = insert(node->right, key);

    /* return the (unchanged) node pointer */
    return node;
}
void inorder(struct node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d \n", root->key);
        inorder(root->right);
    }
}
void preorder(struct node *root)
{
    if (root != NULL)
    {
         printf("%d \n", root->key);
        preorder(root->left);

        preorder(root->right);
    }
}
void postorder(struct node *root)
{
    if (root != NULL)
    {

        postorder(root->left);

        postorder(root->right);
         printf("%d \n", root->key);
    }
}

struct node* find_Max(struct node* node)
{
    struct node* n = node;
    while(n->right!=NULL)
        n=n->right;

    return n;
}

// deletion in bst
struct node* delete_Node(struct node *root,int data)
{
    struct node *temp;
   if(root==NULL)
   {

       printf("tree is empty ...");

   }
   else if(data<root->key){

    root->left=delete_Node(root->left,data);

   }
   else if(data>root->key){

    root->right=delete_Node(root->right,data);
   }
   else
    {
     if(root->left && root->right)
     {

         temp=find_Max(root->left);

         root->key=temp->key;


         root->left=delete_Node(root->left,temp->key);

     }
     else
        {

     if(root->left==NULL){
        temp=root->right;
        root=NULL;
        return temp;
     }
     if(root->right==NULL){
    temp=root->left;

         root=NULL;
              return temp;
        }
     }
   }
   return root;
}



int main()
{

    struct node *root = NULL;
    int data;
    root = insert(root, 50);
    insert(root, 30);
    insert(root, 20);
    insert(root, 40);
    insert(root, 70);
    insert(root, 60);
    insert(root, 80);
   printf("in order traversal is...\n");

    inorder(root);
     printf("pre order traversal is...\n");
       preorder(root);
    printf("post order traversal is...\n");
    postorder(root);
printf("enter the data to be deleted");
scanf("%d",&data);
delete_Node(root,data);
 printf(" after deletion  in order traversal is...\n");
inorder(root);

    return 0;
}

