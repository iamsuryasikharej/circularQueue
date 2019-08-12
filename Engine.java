class Engine
{
	public static void main(String[] args)throws Exception {
		CircularQueue obj=new CircularQueue();
		obj.enqueue(33);
		obj.enqueue(44);
		obj.enqueue(55);
		obj.enqueue(66);
		obj.enqueue(77);
		obj.disp();
		System.out.println(obj.dequeue()+"dequeued");
		obj.disp();
		System.out.println("njcsbsd");
		obj.enqueue(88);
		System.out.println(obj.dequeue()+"dekds");
		obj.enqueue(99);
		System.out.println(obj.dequeue()+"dekds");
		System.out.println(obj.dequeue()+"dekds");
		System.out.println(obj.dequeue()+"dekds");
		System.out.println(obj.dequeue()+"dekds");
		System.out.println(obj.dequeue()+"dekds");
		System.out.println(obj.dequeue()+"dekds");
		System.out.println(obj.dequeue()+"dekds");
		
		
		
		obj.disp()
;
		




	}
}





class CircularQueue
{
	static int capacity=5;
	Integer[] queue;
	int rear=0;
	int front=0;
	int size=0;
	CircularQueue()
	{
		this(capacity);
	}
	CircularQueue(int cap)
	{
		queue=new Integer[cap];
	}


	public void enqueue(int x)
	{
		if(getSize()==capacity)
		{
			System.out.println("queue is full");
		}
		else
		{
			queue[rear]=x;
		    rear=(rear+1)%capacity;
		    size++;
		}


	}
	public int dequeue()
	{   int temp=0;
		if(getSize()==0)
		{
			System.out.println("queue empty");

		}
		else
		{
			 temp=queue[front];
			 queue[front]=null;
			 front=(front+1)%capacity;
			size--;

		}
		return temp;
	}
	
	
	public int getSize()
	{
		return size;
	}

	public void disp()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(queue[i]);
		}
	}












}














class QueueEmptyException extends Exception
{
	QueueEmptyException(String str)
	{
		super(str);
	}

}

class QueueFullException extends Exception
{
	QueueFullException(String str)
	{
		super(str);
	}

}