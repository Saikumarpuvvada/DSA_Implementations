package linked_list;



public class LL {
  public  Node head;
   private Node tail;
   public int size;
   public LL(){
    this.size=0;
   }
   public void display(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.val+"->");
        curr=curr.next;
    }
    System.out.print("null");
    System.out.println();
   
   }
    public class Node {
        int val;
        Node next;
        
       
       public Node(int val){
            this.val=val;
        }
       public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }        
    }
    public void insertAtIndexRec(int val,int ind,Node n){
        if(ind==1){
            Node node=new Node(val);
            node.next=n.next;
            n.next=node;
           size++;
           return;
        }if(n.next!=null){
        insertAtIndexRec(val, ind-1, n.next);
        }
    }
    public  void insertFirst(int val){
        Node f=new Node(val);
        f.next=head;
        head=f;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void deleteFirst(){
       if(size==1){
        head=null;
       }
       if(head==null){
        tail=null;
       }
       head=head.next;
       size--;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        tail=node;
        size++;
    }
    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    public void insertAtIndex(int val,int ind){
        if(size==0){
            insertFirst(val);
        }
        int c=0;
        Node node=new Node(val);
        Node temp=head;
        while(c!=ind-1){
            temp=temp.next;
            c++;
        }
        Node nextNode=temp.next;
        temp.next=node;
        node.next=nextNode;
        size++;
    }
    public void deleteAtIndex(int ind){
        Node temp=head;
        for(int i=0;i<ind-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}
