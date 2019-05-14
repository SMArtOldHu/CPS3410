package my_project;

public class MyPriorityQueue {
	
	private double[] queue;
	private int size;
	
	MyPriorityQueue(int size)
	{
		queue=new double[size];
		this.size=0;
	}
	MyPriorityQueue()
	{
		queue=new double[10];//default is 10
		this.size=0;
	}
	
	void insert( double priority) 
	{
		if(size==(queue.length-1)) //if size is too big
		{
			double[]tempQueue=new double[queue.length*2+1];
			for(int i=0;i<queue.length;i++)
			{
				tempQueue[i]=queue[i];
			}
			queue=tempQueue;

		}
		
		//use Buble sort
		queue[size]=priority;
		for(int i=size;i>0;i--)
		{
			if(queue[i]<queue[i-1])
			{
				//swap
				double temp=queue[i];
				queue[i]=queue[i-1];
				queue[i-1]=temp;
			}
			
		}
		size++;
		
	}
	int delete_min() throws EmptyPQException
	{
		return (int)deleteMin();
	}
	//isEmpty
	public boolean isEmpty()
	{
		return size==0;
	}
	//findMin
	double findMin()
	{
		return queue[0];
	}
	//deleteMin
	double deleteMin ()throws EmptyPQException 
	{
		double temp=queue[0];
		for(int i=0;i<size-1;i++)
		{
			queue[i]=queue[i+1];
		}
		queue[size]=0;
		size--;
		return temp;
	}
	
	void printPQ()
	{
		System.out.print("MyPQ is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[i]+" ");
			
		}
	}
}