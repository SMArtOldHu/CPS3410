package my_project;

public class TestMyPQ {

	public static void main(String[] args) {
//		MyPriorityQueue pq=new MyPriorityQueue();
//		pq.insert(15);
//		pq.insert(8);
//		pq.insert(78);
//		pq.printPQ();
//		try {
//			pq.delete_min();
//			pq.delete_min();
//			pq.delete_min();
//			pq.delete_min();
//		} catch (EmptyPQException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		pq.printPQ();
		
		MyPriorityQueueV1 pqv1 = new MyPriorityQueueV1();
		pqv1.insert(15);
		pqv1.insert(10);
		pqv1.insert(78);
		pqv1.insert(79);
		pqv1.insert(90);
		pqv1.insert(12);
		pqv1.insert(89);
		pqv1.print();
		
		try{
			System.out.println(pqv1.deleteMin());
			System.out.println(pqv1.isEmpty());
			System.out.println(pqv1.deleteMin());
			System.out.println(pqv1.isEmpty());
			System.out.println(pqv1.deleteMin());
			System.out.println(pqv1.isEmpty());
			System.out.println(pqv1.deleteMin());
			System.out.println(pqv1.isEmpty());
			System.out.println(pqv1.deleteMin());
			System.out.println(pqv1.isEmpty());
			System.out.println(pqv1.deleteMin());
			System.out.println(pqv1.isEmpty());
			System.out.println(pqv1.deleteMin());
			System.out.println(pqv1.isEmpty());
			System.out.println(pqv1.deleteMin());
			System.err.println(pqv1.findMin());
		}catch(EmptyPQException e){
			e.printStackTrace();
		}
		
	}

}
