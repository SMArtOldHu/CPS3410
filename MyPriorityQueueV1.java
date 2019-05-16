package my_project;

public class MyPriorityQueueV1 {
	// size of the queue, represent the number of elements in queue
	private int size;
	// store the elements in queue
	private double[] queue;
	// constructor
	public MyPriorityQueueV1(){
		queue = new double[10];
	}
	// insert
	public void insert(double priority){
		// expand the queue
		if(size >= queue.length - 1){
			double[] tmpQueue = new double[2 * queue.length + 1];
			for(int i = 0; i < queue.length; i++){
				tmpQueue[i] = queue[i];
			}
			queue = tmpQueue;
		}
		queue[++size] = priority;
		buildHeap(queue, size);
	}
	// delete_min
	public int delete_min() throws EmptyPQException{
		if(size <= 0){
			throw new EmptyPQException("delete from an empty queue!!!");
		}
		double minimum = queue[1];
		queue[1] = queue[size];
		queue[size--] = 0;
		adjustHeap(queue, 1, size);
		return (int)minimum;
	}
	// check if empty
	public boolean isEmpty(){
		return size <= 0;
	}
	// find the minimum value
	public double findMin() throws EmptyPQException{
		if(size <= 0){
			throw new EmptyPQException("it is an empty queue!!!");
		}
		return queue[1];
	}
	// deleteMin
	public double deleteMin() throws EmptyPQException{
		if(size <= 0){
			throw new EmptyPQException("delete from an empty queue!!!");
		}
		double minimum = queue[1];
		queue[1] = queue[size];
		queue[size--] = 0;
		adjustHeap(queue, 1, size);
		return minimum;
	}
	// adjust heap to minimum heap
	private void adjustHeap(double[] queue, int start, int end){
		double tmp = queue[start];
		for(int i = 2 * start; i <= end; i = i * 2){
			if(i < end && queue[i] > queue[i + 1]){
				i++;
			}
			if(queue[i] >= tmp){
				break;
			}
			queue[start] = queue[i];
			start = i;
		}
		queue[start] = tmp;
	}
	// build minimum heap
	private void buildHeap(double[] queue, int size){
		for(int i = size / 2; i > 0; i /= 2){
			adjustHeap(queue, i, size);
		}
	}
	// print the queue
	public void print(){
		for(int i = 1; i <= size; i++){
			System.out.print(queue[i] + "\t");
		}
		System.out.println();
	}
}
