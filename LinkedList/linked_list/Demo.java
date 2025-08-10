package linked_list;



public class Demo {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertAtIndex(9, 4);
        list.deleteFirst();
        list.deleteLast();
       list.deleteAtIndex(3);
       list.display();
       list.insertAtIndexRec(1, 2, list.head);
       list.display();
        // DLL list=new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(1);
        // list.insertLast(4);
        // list.insertLast(5);
        // list.insertAtIndex(6, 3);
        // list.display();
        // list.displayReverse();

    }
}
