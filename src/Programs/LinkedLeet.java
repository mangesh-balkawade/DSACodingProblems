//package Programs;
//
//class Node
//{
//    int value;
//    Node next;
//}
//
//class MyLinkedList {
//    Node head;
//    int length=0;
//   
//
//    public MyLinkedList() {
//        
//    }
//    
//    public int get(int index) {
//        if(index<0||index>length)
//        return -1;
//        int icnt=0;
//        Node temp=head;
//        while(icnt!=(index-1))
//        {
//          temp=temp.next;
//        }
//        return temp.value;
//    }
//    
//    public void addAtHead(int val) {
//     
//        Node newn =new Node();
//        newn.value=val;
//        newn.next=null;
//        if(head==null)
//        {
//          head=newn;
//        }
//        else
//        {
//            newn.next=head;
//            head=newn;
//        }
//        length++;
//    }
//    
//    public void addAtTail(int val) {
//        Node temp=head;
//        while(temp.next!=null)
//        {
//        temp=temp.next;
//        }
//        Node newn =new Node();
//        newn.value=val;
//        newn.next=null;
//        temp.next=newn;
//        length++;
//    }
//    
//    public void addAtIndex(int index, int val) {
//        if(index>length+1)
//        return;
//        if(index==length+1)
//        {
//addAtTail(val);
//        }
//        else if(index==0)
//        {
//            addAtHead(val);
//        }
//      else
//      {
//         Node temp=head;
//        for(int i=0;i<index-1;i++)
//        {
//            temp=temp.next;
//        }
//         Node newn =new Node();
//        newn.value=val;
//        newn.next=null;
//        temp.next=newn;
//        length++;
//      }
//        
//    }
//    
//    public void deleteAtIndex(int index) {
//     
//         Node temp=head;
//        for(int i=0;i<index-1;i++)
//        {
//            temp=temp.next;
//        }
//        if(temp.next.next!=null)
//        temp.next=temp.next.next;
//        else
//        temp.next=null;
//        length--;
//    }
//}
//
///**
// * Your MyLinkedList object will be instantiated and called as such:
// * MyLinkedList obj = new MyLinkedList();
// * int param_1 = obj.get(index);
// * obj.addAtHead(val);
// * obj.addAtTail(val);
// * obj.addAtIndex(index,val);
// * obj.deleteAtIndex(index);
// */
//public class LinkedLeet {
//	public static void main(String[] args) {
//		  MyLinkedList obj = new MyLinkedList();
//		  int param_1 = obj.get(1);
//		  obj.addAtHead(1);
//		  obj.addAtTail(2);
//		  obj.addAtIndex(0,2);
//		  obj.deleteAtIndex(3);
//	}
//
//}
