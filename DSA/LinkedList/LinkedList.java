package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        this.size = 0;
    }

//   ========================= Insert In The LinkedList.LinkedList ======================== //

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public static void insert(int val , int index){

    }

    public void insertEnd(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

//   ========================= Delete From The LinkedList.LinkedList ======================== //

    public int deleteFirst(){
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;

        return val;
    }

//    ============================= Display LinkedList.LinkedList ========================== //

    public void Display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
            System.out.print("END");
    }

//    =========================================================================== //

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
    }

//   =========================== AMAZON FACEBOOK GOOGLE MICROSOFT APPLE INTERVIEW QUESTIONS ===================== //

//    =================================  REMOVE DUPLICATES ================================ //

    public Node removeDuplicates(Node head){
        if(head == null)
            return head;

        Node node = head;

        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            } else{
                node = node.next;
            }
        }

        return head;
    }

//    ================================ MERGE TWO LISTS ======================================= //

    public static Node MergeTwoLists(Node head1 , Node head2){

        Node temp1 = head1;
        Node temp2 = head2;

        while(head1.next != null && head2.next != null){

        }

        return head1.val < head2.val ? head1 : head2;
    }

    //    ================================ MERGE TWO LISTS ======================================= //

    public void insertUsingRecursion(int val , Node head){

        Node temp = head;
        temp = temp.next;
    }

    public Node rotateByOne(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        System.out.println(temp.next.val);
        temp.next = head;
        System.out.println(temp.next.val);
        head = temp.next;

        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    public Node rotateRight(Node head, int B) {
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = head;
        head = temp.next;

        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }


    public static void main(String[] args){
//        Node node = new Node(1);

        LinkedList ll = new LinkedList();
        ll.insertEnd(1);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
//        ll.insertEnd(4);
        ll.insertEnd(5);

//        ll.Display(ll.head);
//        ll.rotateRight(ll.head , 2);

//        ll.rotateByOne(ll.head);
        ll.Display(ll.head);


    }
}

















