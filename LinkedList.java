import java.util.*;
public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Add node on First possition in LinkList
    public void addFirst(int data){
        //step1=create new node
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2=newNode next =head (this step is responsible for create a node)
        newNode.next=head;//link second node of head to the first node of head

        //step3-head=newNode  (point to next node)
        head=newNode;

    }

    //Add node on last possition in link list
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
       
        //print the LinkList
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    //Add node on any index in LinkList
    /*public void add(int idx, int data){
        if(idx==0){//add on head possition on first node
            addFirst(data);
            return;
        }

        //add newnode at middle 
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1; temp-> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //Remove the First node in LL 
    public int removeFirst(){
        //special case
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    //Remove last node in LL
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //previous node: i=size-2;
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //Iterative search in LL
    public int itrSearch(int key){
        Node temp=head;
        int i=0;

        while(temp !=null){
            if(temp.data==key){
                System.out.println("Key is at index: "+i);
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    //reverse a node
    public void reverse(){
       Node prev=null;
       Node curr=tail=head;
       Node next;

       while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       head=prev;
    }

    //slow fast approch
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next !=null){
            slow=slow.next; //+1
            fast=fast.next.next;  //+2
        }
        return slow;//slow is midNode
    }
    public boolean checkPalendrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find mid
        Node midNode=findMid(head);

        //reverce 2nd half
        Node prev= null;
        Node curr= midNode;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }

        Node right= prev;// right half head
        Node left=head;

        //check left hslf snd right half
        while(right!=null){
            if(left.data!= right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();

        System.out.println(""+ll.checkPalendrome());

        //System.out.println("Size of LL is: "+ll.size);

        ll.removeFirst();
        //ll.print();
        //System.out.println("Size of LL after remove first is: "+ll.size);

        ll.removeLast();
        //ll.print();
        //System.out.println("Size of LL  after remove last is: "+ll.size);

        //System.out.println(ll.itrSearch( 3));
        //System.out.println(ll.itrSearch(10));

        ll.reverse();
        //ll.print();
    }*/














    //Detect cycle
        /*public static boolean isCycle(){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;// cycle exist
                }
            }
            return false;//cycle don't exists
        }
        public static void main(String args[]){
            head=new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=head;
            //1->2->3->1
            System.out.println(isCycle());
        }*/







/*public static boolean isCycle(){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;// cycle exist
                }
            }
            return false;//cycle don't exists
        }


//remove Cycle in the LinkedList
public static void removeCycle(){
    //detect cycle
    Node slow=head;
    Node fast=head;
    boolean cycle=false;

    while(fast!=null && fast.next!=null){
        slow=slow.next;//moves +1
        fast=fast.next.next;// moves +2
        if(slow==fast){
            cycle=true;
            break;
        }
    }
    if(cycle==false){
        return;
    }

    //find meeting point
    slow=head;
    Node prev=null; //store last node
    while(slow!=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }

    //remove cycle -> last.next=null
    prev.next=null;
}

 public static void main(String args[]){
            head=new Node(1);
            Node temp=new Node(2);
            head.next=temp;
            head.next.next=new Node(3);
            head.next.next.next=temp;
            //1->2->3->2

            System.out.println(isCycle());
            removeCycle();
            System.out.println(isCycle());
}*/













/*public Node getMid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast==null && fast.next==null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;  //mid
}

private Node merge(Node head1, Node head2){
    Node mergedLL=new Node(-1);
    Node temp=mergedLL;

    while(head1!=null && head2 !=null){
        if(head1.data <=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
    while(head1!=null){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
    }
    while(head2!=null){
          temp.next=head2;
            head2=head2.next;
            temp=temp.next;
    }
    return mergedLL.next;
}


public Node mergeSort(Node head){
    if(head==null || head.next==null){
        return head;
    }
    //find mid
    Node mid=getMid(head);

    //left MS and right MS
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft=mergeSort(head);
    Node newRight=mergeSort(rightHead);

    //merge
    return merge(newLeft, newRight);
}

public static void main(String args[]){
    LinkedList ll=new LinkedList();

    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    
    ll.print();
    ll.head=ll.mergeSort(ll.head);
    ll.print();
}*/














/*public void ZigZag(){
    //mid
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid= slow;

    //reverce 2nd half
    Node curr= mid.next; //right half
    mid.next=null; //left half
    Node prev=null;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    Node left=head;
    Node right=prev;
    Node nextL, nextR;

    //alt merge - zigzag merge
    while(left !=null&& right != null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right = nextR;

    }
}

public static void main(String args[]){
    LinkedList ll=new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(8);
    ll.addLast(9);
    //1->2->3->4->5
    ll.print();
    ll.ZigZag();
    ll.print();
}*/



















}