
package linkedlistdemo;


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
    public void insertat(int index,int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(index==0)
        {
            node.next=head;
            head=node;
        }
        else
        {
            Node n = head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }
    public void remove(int index,int data)
    {
        if(index==0)
        {
            head=head.next;
   
        }
        else
        {
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
                n1=n.next;
                n.next=n1.next;
                n1=null;
                
            }
        }
    }
    public void show(){
        Node node = head;
        System.out.println("elements=");
        while(node.next!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println(node.data);
    }
        
           
}

 class Linkedlistdemo {

    
    public static void main(String[] args) {
        Linkedlist1 list = new Linkedlist1();
        list.insert(10);
        list.insert(20);
        list.insertat(1, 15);
        list.insertat(3, 25);
        list.insertat(4, 30);
        list.remove(0, 10);
        list.show();
        
    }
    
}

