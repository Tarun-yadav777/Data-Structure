package data_structure.LinkedList;

class Last3rdlist
{
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
    public void last3()
    {
        Node temp_node = head;
        for(int i=1;i<getLength()-2;i++)
        {
            temp_node=temp_node.next;
        }
        System.out.println("Data of the last 3rd element is = "+temp_node.data);
    }
}
public class Lest3rd {
    public static void main(String arg[])
    {
        Last3rdlist obj = new Last3rdlist();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        System.out.println("length of the list = "+obj.getLength());
        obj.last3();
    }
}
