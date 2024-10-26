package week10;

public class linkedlist {
    class Node{
        int data;
        Node next;

    }
    Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node nn = new Node();
        nn.data=item;
        if(size==0){
            head =nn;
            tail=nn;
            size++;

        }else{
            nn.next=head;
            head=nn;
        }
        size++;
    }
    public void addLast(int item ){
        if(size==0)
        addFirst(item);
        else{
            Node nn= new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;

        }
    }

    public Node getNode(int index){
       Node temp = head;
       for(int i=0;i<index;i++){
        temp=temp.next;
       }
        return temp;   
    } 


    public int getFirst(){
        return head.data;
    }

    public int getLast(){
        return tail.data;

    }

    public int getData(int k){
        if(k<0 || k>=size){
            return -1;
        }
        else if(k==0){
        return getFirst();
        }
        else if(k==size -1){
        return getLast();
        }
        else {
        return getNode(k).data;
        }

    }
    public int removeFirst(){
        int rv= head.data;
        if(size==1){
         head = null;
        tail = null;
        }else {
            Node temp=head;
            head= head.next;
            temp.next=null;
        }
        size--;
        return rv;


    }

    public void addinMiddle(int item,int index){
     if(index==0) addFirst(item);
        else if (index== size -1) addLast(item);
        else{
            Node nn= new Node();
            nn.data=item;
            Node k_ith = getNode(index - 1);
             nn.next = k_ith.next; 

            size++;

        }
    }
   
     

    public void Display(){
        
        Node temp= head;
        while(temp!= null){
            System.out.println(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

