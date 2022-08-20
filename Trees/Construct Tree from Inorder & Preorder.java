class Solution
{ 
    int start=0;
    
     static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    public  Node solution(int inorder[], int pre[],int l,int h,int n){
             if(start>=n || l>h)
                   return null;
                  
             int ele=pre[start++];
              
              Node root=new Node(ele);
                if(l==h)
                  return root;
                  int pos=map.get(ele);
                // start++;
              root.left=solution(inorder,pre,l,pos-1,n);
             root.right=solution(inorder,pre,pos+1,h,n);
                return root;
              
    }
    public  Node buildTree(int inorder[], int pre[], int n)
    {
       
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        //int start=0;
         Node root=solution(inorder,pre,0,n-1,n);
         return root;
    }
}
