/* you only have to complete the function given below.  
node is defined as  

struct node {
    
    int data;
    struct node *left;
    struct node *right;
  
};

*/
int getHeight(struct node* node) {
    // Write your code here
if (node==NULL) { 
   return 0;}
   if (node->left == NULL && node->right == NULL) 
    return 0; 
   else{
    // compute the depth of each subtree 
    int lDepth =getHeight(node->left); 
    int rDepth = getHeight(node->right);
    // use the larger one 
    if (lDepth > rDepth) return(lDepth+1); 
    else return(rDepth+1); 
  } 


    
}

																																		