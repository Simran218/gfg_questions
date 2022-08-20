ArrayList<Integer> rightView(Node node) {
        //add code here.
          ArrayList<Integer> ar=new ArrayList<Integer>();
           Queue<Node> q=new LinkedList<Node>();
                 if(node!=null){
                q.add(node);
                 while(!q.isEmpty()){
                       int n=q.size();
                    
                   
                          while(n>0){
                              Node temp=q.remove();
                                 if(n-1==0)
                                  ar.add(temp.data);
                                 if(temp.left!=null)
                                       q.add(temp.left);
                                    if(temp.right!=null)
                                       q.add(temp.right);   
                              
                                            n--;
                          }     
                 }}
                return ar;
    }
