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
		if(size==(queue.length-1)) //if size is too big, Check whether array need to be expended;
		{
			double[]tempQueue=new double[queue.length*2+1];
			for(int i=0;i<queue.length;i++)
			{
				tempQueue[i]=queue[i];
			}
			queue=tempQueue;

		}
		
		//Insert value at bottom of array;
		queue[size]=priority;
		//Use bubble sort to shift forward;
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
	double findMin() throws EmptyPQException
	{
		if(size <= 0){//Check Empty;
			throw new EmptyPQException("delete from an empty queue!!!");
		}
		return queue[0];
	}
	//deleteMin
	double deleteMin ()throws EmptyPQException 
	{
		if(size <= 0){//Check Empty;
			throw new EmptyPQException("delete from an empty queue!!!");
		}
		double temp=queue[0];//Save queue[0]
		for(int i=0;i<size-1;i++)//Shift queue to queue[size-1];
		{
			queue[i]=queue[i+1];
		}
		queue[size]=0;//Clear the last one
		size--;
		return temp;
	}
	//print out the queue
	void printPQ()
	{
		System.out.print("MyPQ is: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(queue[i]+" ");
			
		}
	}
}