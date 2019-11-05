package data_structure.LinkedList;

import jdk.swing.interop.SwingInterOpUtils;

class Middle{
    Node head;
    public void element(int data)
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
    public int mid()
    {   int c=0,mid=0;
        Node temp_node=head;
        while(temp_node!=null)
        {
            temp_node=temp_node.next;
            c++;
        }
        mid=c/2;
        return mid;
    }
    public void midNode()
    {
        Node temp_node=head;
        for(int i=0;i<mid();i++)
        {
            temp_node=temp_node.next;
        }
        System.out.println("Data of the middle node DATA is = "+temp_node.data+" of node "+mid());
    }
}

public class MiddleElem {
    public static void main(String arg[])
    {
        Middle obj = new Middle();
        obj.element(1);
        obj.element(2);
        obj.element(3);
        obj.element(4);
        obj.element(5);
        obj.element(6);
        obj.midNode();

    }

}
