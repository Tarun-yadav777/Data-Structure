package data_structure.LinkedList;

class Reverse
{   Node head;
    public void enter(int data)
    {
        Node new_node = new Node();
        new_node.data=data;
        new_node.next=null;
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            Node temp_node = head;
            while(temp_node.next!=null)
            {
                temp_node=temp_node.next;
            }
            temp_node.next=new_node;
        }
    }
    public void rev()
    {
        Node temp_node=head;
        Node prev=null,current=null;
        while(temp_node!=null)
        {
            current=temp_node;
            temp_node=temp_node.next;
            current.next=prev;
            prev=current;
            head=current;

        }
    }
    public void show()
    {
        Node temp_node=head;
        System.out.println("Elements");
        while(temp_node!=null)
        {
            System.out.print(temp_node.data+" ");
            temp_node=temp_node.next;
        }
        System.out.println();

    }
}

public class ReverseLL {
    public static void main(String arg[])
    {
        Reverse obj = new Reverse();
        obj.enter(1);
        obj.enter(2);
        obj.enter(3);
        obj.enter(4);
        obj.enter(5);
        System.out.println("Before reverse = ");
        obj.show();
        obj.rev();
        System.out.println("After reverse = ");
        obj.show();
    }

}
