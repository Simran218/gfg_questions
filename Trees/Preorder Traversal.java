static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ar=new ArrayList<Integer>();
               Stack<Node> st=new Stack<Node>();
                 Node temp=root;
                    while(temp!=null || !st.empty()){
                              while(temp!=null){
                                  ar.add(temp.data);
                                    st.push(temp);
                                    temp=temp.left;
                               }
                              temp=st.pop();
                              temp=temp.right;
                              
                      }
        
             return ar;   
    }
