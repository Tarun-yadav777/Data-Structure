
package linkedlist;
class Node{
    int data;
    Node next;
    
}
class Linkedlist1{
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
            
        }
    }
    public void show(){
        Node node = head;
        while(node.next!=null)
        {
            System.out.print("inserted elements "+node.data+" ");
            node=node.next;
        }
        System.out.println(node.data);
    }
        
           
}

public class Linkedlist {

    
    public static void main(String[] args) {
        Linkedlist1 list = new Linkedlist1();
        list.insert(10);
        list.insert(20);
        list.show();
        
    }
    
}
