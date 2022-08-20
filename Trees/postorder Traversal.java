ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> ar=new ArrayList<Integer>();
       Stack<Node> st=new Stack<Node>();
                 st.push(root);
                 Node temp=root;
                 while(!st.empty()){
                     if(temp.left!=null){
                         temp=temp.left;
                         st.push(temp);
                       }
                       else if(temp.right!=null){
                         temp=temp.right;
                         st.push(temp);
                        }
                    else{
                        temp=st.pop();
                        ar.add(temp.data);
                         while(!st.empty() && (temp==st.peek().right || st.peek().right==null)){
                                      temp=st.pop();
                                     ar.add(temp.data);
                                     
                              }
                             if(!st.empty() && (temp==st.peek().left && st.peek().right!=null)){
                                       temp=st.peek().right;
                                       st.push(temp);
                             }
                    }
                 }
       return ar;
    }
