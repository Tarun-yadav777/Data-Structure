package data_structure.Queue;

class CompareQueues{
    int front,rear,size;
    int queue[] = new int[5];
    public int getSize(){
        return size;
    }
    public Boolean IsEmpty(){

        return getSize()==0;
    }
    public Boolean IsFull(){

        return getSize()==10;
    }
    public void enQueue(int data){
        if (!IsFull()) {
            queue[rear] = data;
            rear++;
            size++;
        }
        else
            System.out.println("queue is full");
    }
    public int deQueue(){
        int data=queue[front];
        if(!IsEmpty()){
            front++;
            size--;
        }
        else
            System.out.println("Queue is empty");
        return data;
    }
    public void show(){
        System.out.print("elements:");
        for(int n: queue){
            System.out.print(n+" ");

        }
        System.out.println();
    }
    public void compareQueue(CompareQueues o)
    {
        if(IsEmpty() && o.IsEmpty())
            System.out.println("No element to compare");
        else
            for(int i=0;i<5;i++) {
                if (queue[i] == o.queue[i])
                    System.out.println("Element of index "+i+" in queue is same...");
            }
    }
}

public class MidTermQ2 {
    public static void main(String arg[])
    {
        CompareQueues obj = new CompareQueues();
        CompareQueues obj1 = new CompareQueues();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.enQueue(5);
        obj.show();
        obj1.enQueue(1);
        obj1.enQueue(2);
        obj1.enQueue(3);
        obj1.enQueue(4);
        obj1.enQueue(5);
        obj1.show();
        obj.compareQueue(obj1);

    }
}
