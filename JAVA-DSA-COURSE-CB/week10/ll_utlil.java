package week10;

public class ll_utlil {
    
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
            ll.addFirst(40);
            ll.addFirst(30);
            ll.addFirst(20);
            ll.addFirst(10);
            ll.Display();
            ll.addLast(50);
            ll.Display();
            ll.addinMiddle(30, 2);
            ll.Display();
            System.out.println(ll.removeFirst());
            ll.Display();
            
    }
}