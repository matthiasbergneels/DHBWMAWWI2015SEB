package datenstrukturen.queue;

public class QueueTest {


		public static void main(String[] args) {
			
			Queue<String> queue = new Queue<String>();
			
			queue.enqueue("1");
			queue.enqueue("2");
			queue.enqueue("3");
			queue.enqueue("4");
			queue.enqueue("5");
			queue.enqueue("6");
			
			System.out.println("Size: " + queue.size());
			System.out.println("Data: " + queue.dequeue());
			System.out.println("Data: " + queue.dequeue());
			queue.enqueue("7");
			System.out.println("Size: " + queue.size());
			System.out.println("Data: " + queue.dequeue());
			System.out.println("Data: " + queue.dequeue());
			System.out.println("Size: " + queue.size());
			

		}

	

}
