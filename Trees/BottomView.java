 class Pair{
    int key;
    Node node;
       Pair(int key,Node node){
           this.key=key;
           this.node=node;
       }
}

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
         ArrayList<Integer>arr=new ArrayList<>();
       HashMap<Integer,Node>mp=new HashMap<>();
       Queue<Pair> q=new LinkedList<>();
            q.add(new Pair(0,root));
            int l=0,r=0;
               while(!q.isEmpty()){
                    Pair p=q.remove();
                     Node node=p.node;
                       Integer i=p.key;
                      if(node.left!=null){
                          q.add(new Pair(i-1,node.left));
                          if(l>i-1){
                               l=i-1;
                          }
                         
                      }
                     if(node.right!=null){
                          q.add(new Pair(i+1,node.right));
                             if(r<i+1){
                               r=i+1;
                          }
                      }
                    
                        mp.put(i,p.node);
                        //arr.add(node.data);
                        
                    
               }
            /* for(Map.Entry m:mp.entrySet()){
                 Node n=(Node)m.getValue();
                 arr.add(n.data);
             }*/
              for(int i=l;i<=r;i++){
                  arr.add(mp.get(i).data);
              }
         return arr;
        
    }
    }
