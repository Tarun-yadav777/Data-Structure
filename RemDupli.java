package data_structure.LinkedList;

class Remove{
    Node head;
    public void insert(int data)
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
    public int getLength()
    {
        Node temp_node=head;
        int len=0;
        while(temp_node!=null)
        {
            temp_node=temp_node.next;
            len++;
        }
        return len;
    }
    public void remDupli()
    {
        Node first_node=head,second_node=null,dup=null;
        while(first_node!=null)
        {
            dup=first_node;
            second_node=first_node.next;
            while(second_node!=null)
            {
                if(first_node.data==second_node.data)
                {
                    dup.next=second_node.next;
                }
                second_node=second_node.next;
            }
            first_node=first_node.next;
        }
    }

}
public class RemDupli {
    public static void main(String arg[])
    {
        Remove obj = new Remove();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(3);
        obj.insert(5);
        System.out.println("Length of the entered list is = "+obj.getLength());
        obj.remDupli();
        System.out.println("Length of removed duplicate list is = "+obj.getLength());
    }
}
