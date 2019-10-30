package data_structure.LinkedList;

class SortLinkedList
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
    public void show()
    {
        Node temp_node = head;
        System.out.println("Elements= ");
        while(temp_node.next!=null)
        {
            System.out.print(temp_node.data+" ");
            temp_node=temp_node.next;
        }
        System.out.println(temp_node.data);
    }
    public int getSize()
    {   int count=0;
        Node temp_node = head;
        int temp_no = temp_node.data;
        while(temp_node!=null)
        {
            count++;
            temp_node=temp_node.next;
        }
        return count;
    }
    public void sort()
    {   int temp;
        Node first_node = head,second_node=null;
        while(first_node!=null)
        {
            second_node=first_node.next;
            while(second_node!=null)
            {
                if(first_node.data>second_node.data)
                {
                    temp=first_node.data;
                    first_node.data=second_node.data;
                    second_node.data=temp;
                }
                second_node=second_node.next;
            }
            first_node=first_node.next;
        }
    }
}
public class MidTermQ3 {
    public static void main(String arg[])
    {
        SortLinkedList obj = new SortLinkedList();
        obj.insert(5);
        obj.insert(3);
        obj.insert(2);
        obj.insert(4);
        obj.insert(1);
        System.out.println("No of elements in list:- "+obj.getSize());
        System.out.println("Unsorted list:- ");
        obj.show();
        obj.sort();
        System.out.println("Sorted list:- ");
        obj.show();
    }
}
