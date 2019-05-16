package my_project;

public class TestMyPQ {

	public static void main(String[] args) {
		MyPriorityQueue pq=new MyPriorityQueue();
		
		int testNum=100000;
		long insertStartTime=System.currentTimeMillis();
		for(int i=0;i<testNum;i++)
		{
			pq.insert(testNum*Math.random());
		}
		long insertEndTime=System.currentTimeMillis();
		System.out.println("When insert"+testNum+", pq take:"+(insertEndTime-insertStartTime)+"ms");
		
		try {
			long deleteStartTime=System.currentTimeMillis();
			for(int i=0;i<testNum;i++)
			{
				pq.delete_min();
			}
			long deleteEndTime=System.currentTimeMillis();
			System.out.println("When delete"+testNum+", pq take:"+(deleteEndTime-deleteStartTime)+"ms");
		} catch (EmptyPQException e) {
			e.printStackTrace();
		}
		//pq.printPQ();
		
		
		MyPriorityQueueV1 pqv1 = new MyPriorityQueueV1();
		long insertStartTimev1=System.currentTimeMillis();
		for(int i=0;i<testNum;i++)
		{
			pqv1.insert(testNum*Math.random());
		}
		long insertEndTimev1=System.currentTimeMillis();
		System.out.println("When insert"+testNum+", pqv1 take:"+(insertEndTimev1-insertStartTimev1)+"ms");
		//pqv1.print();
		
		try{
			long deleteStartTimev1=System.currentTimeMillis();
			for(int i=0;i<testNum;i++)
			{
				pqv1.delete_min();
			}
			long deleteEndTimev1=System.currentTimeMillis();
			System.out.println("When delete"+testNum+", pqv1 take:"+(deleteEndTimev1-deleteStartTimev1)+"ms");
		}catch(EmptyPQException e){
			e.printStackTrace();
		}
		/*try{
			for(int i=0;i<testNum;i++)
			{
				System.out.println(pqv1.deleteMin());
			}
		}catch(EmptyPQException e){
			e.printStackTrace();
		}
		pqv1.print();*/
	}

}
