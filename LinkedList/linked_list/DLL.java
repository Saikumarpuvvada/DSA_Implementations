package linked_list;

public class DLL {
    public class  Node {
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val=val;
    }  
    }
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node curr=new Node(val);
        if(head==null){
           curr.next=null;
           head=curr;
            tail=curr;
        }else{
            curr.next=head;
            head.prev=curr;
            head=curr;
        }
        curr.prev=null;
        size++;
    } 
    public void insertLast(int val){
        Node curr=new Node(val);
        if(head==tail){
            head.next=curr;
            curr.prev=head;
            tail=curr;
        }else{
            tail.next=curr;
            curr.prev=tail;
            tail=curr;
        }
        tail.next=null;
        size++;
    }
    public void insertAtIndex(int val,int ind){
        Node curr=new Node(val);
        Node temp=head;
        for(int i=0;i<ind-1;i++){
            temp=temp.next;
        }
        Node currNode=temp;
        Node nextNode=temp.next;
        currNode.next=curr;
        curr.prev=currNode;
        curr.next=nextNode;
        nextNode.prev=curr;
        size++;
    }
    public void display(){
        if(head==null){
            System.out.println("null");
        }
        Node curr=head;
        System.out.print("null<->");
        while(curr!=null){
            System.out.print(curr.val+"<->");
            curr=curr.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public void displayReverse(){
        if(head==null){
            System.out.println("null");
        }
        Node curr=tail;
        System.out.print("null<->");
        while(curr!=null){
            System.out.print(curr.val+"<->");
            curr=curr.prev;
        }
        System.out.println("null");
        System.out.println();
    }
}
