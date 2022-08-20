int height(Node node) 
    {
        // code here 
        Queue<Node> q=new LinkedList<Node>();
           q.add(node);
           int h=0;
              while(true){
                  int n=q.size();
                     if(n==0){
                         return h;
                       }
                      h++;
                    while(n>0){
                        Node temp=q.remove();
                          if(temp.left!=null)
                                q.add(temp.left);
                           if(temp.right!=null)
                               q.add(temp.right);
                               n--;
                     }
              }
