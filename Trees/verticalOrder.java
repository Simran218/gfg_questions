class pair{
    Node node;
    Integer key;
         pair(Node node,Integer key){
             this.node=node;
             this.key=key;
         }
}
class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        int l=0,r=0;
        Queue<pair> q=new LinkedList<pair>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
             pair p=new pair(root,0);
                q.add(p);
                 while(!q.isEmpty()){
                     p=q.remove();
                     Node temp=p.node;
                     Integer i=p.key;
                        if(temp.left!=null){
                            q.add(new pair(temp.left,i-1));
                            if(l>i-1){
                               l=i-1;
                               }
                           }
                           if(temp.right!=null){
                            q.add(new pair(temp.right,i+1));
                            if(r<i+1){
                               r=i+1;
                              }
                             }
                          if(!map.containsKey(i)){
                              ArrayList<Integer> al=new ArrayList<Integer>();
                                  al.add(temp.data);
                                  map.put(i,al);
                                   
                            }
                        else{
                            map.get(i).add(temp.data);
                                       
                        }
                   }
                   ArrayList<Integer> res=new ArrayList<Integer>(); 
                for(int k=l;k<=r;k++){
                   ArrayList<Integer>temp=map.get(k);
                   for(Integer ele:temp){
                       res.add(ele);
                   }
                }
                return res;
     }
     

      
}
