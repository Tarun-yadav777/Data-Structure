package data_structure.LinkedList;

class NodeL {
  int data;
  NodeL next,prev;
}
public class DoublyLinkedlist {
    NodeL head;
    public void insertAtfront(int data)
    {
        NodeL new_node = new NodeL();
        new_node.data = data;
        new_node.next=head;
        new_node.prev=null;
        if(head!=null)
            head.prev=new_node;
        head=new_node;
    }
    public void insertAtend(int data)
    {
        NodeL new_node = new NodeL();
        new_node.data=data;
        NodeL last = head;
        new_node.next=null;
        if (head == null) {
            new_node.prev = null;
            head = new_node;
        }
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        new_node.prev = last;
    }
    public void printlist()
    {
        NodeL node = head;
        NodeL last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

}
class Main5{
    public static void main(String arg[])
    {
        DoublyLinkedlist list = new DoublyLinkedlist();
        list.insertAtfront(1);
        list.insertAtend(10);
        list.insertAtend(20);
        list.insertAtend(30);
        list.insertAtfront(5);
        list.printlist();
    }

}
