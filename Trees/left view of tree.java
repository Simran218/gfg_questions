ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ar=new ArrayList<Integer>();
           Queue<Node> q=new LinkedList<Node>();
                 if(root!=null){
                q.add(root);
                 while(!q.isEmpty()){
                       int n=q.size();
                    
                    ar.add(q.peek().data);
                          while(n>0){
                              Node temp=q.remove();
                                 if(temp.left!=null)
                                       q.add(temp.left);
                                    if(temp.right!=null)
                                       q.add(temp.right);   
                              
                                            n--;
                          }     
                 }}
                return ar;
             }
             
             
             
             
             
             
             
             
             
             
             
             
             
    
