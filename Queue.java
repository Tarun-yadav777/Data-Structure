package queue;

class Queue1 {

    int front,rear,size;
    int q[] = new int[10];
    public void enQueue(int data)
    {
        if(size!=10)
        {
        q[rear]=data;
        rear++;
        size++;
        }
        else
            System.out.println("queue is full");
    }
    public int deQueue()
    {
        int data = q[front];
        if(size!=0)
        {    
        
        front++;
        size--;
        
        }
        else
            System.out.println("queue is empty");
        return data;
    }
    public void show(){
        System.out.print("orignal queue=");
        for(int n:q)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.print("functional queue ");
        for(int i=0;i<size;i++)
        {
            System.out.print(q[front+i]+" ");
        }
        System.out.println();
    }
           
}


public class Queue {

   
    public static void main(String[] args) {
        Queue1 obj = new Queue1();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.deQueue();
        obj.deQueue();
        obj.show();
            
    }
    
}
