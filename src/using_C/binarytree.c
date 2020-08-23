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
        inorder(root->left);

        inorder(root->right);
    }
}
void postorder(struct node *root)
{
    if (root != NULL)
    {

        inorder(root->left);

        inorder(root->right);
         printf("%d \n", root->key);
    }
}
int main()
{

    struct node *root = NULL;
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
    return 0;
}
