
public class Testprogramm {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		// isEmpty testen
		System.out.println(queue.isEmpty());
		fillQueue(queue);
		System.out.println(queue.isEmpty());
	
		
		// poll testen
		while (!queue.isEmpty()) {
			System.out.println( ((Node)queue.poll()).getInhalt() );			
		}
		System.out.println(queue.isEmpty());
		
		
		// peek testen
		fillQueue(queue);
		System.out.println(queue.peek());			
		System.out.println(queue.isEmpty());
		

		// remove testen
		fillQueue(queue);
		System.out.println(queue.isEmpty());
		while (!queue.isEmpty()) {
			queue.remove();			
		}
		System.out.println(queue.isEmpty());
		
	}

	private static void fillQueue(Queue queue) {
		queue.add(new Dummy("Mara Müller", 1));
		queue.add(new Dummy("Max Muster", 2));
		queue.add(new Dummy("Foo Bar", 3));
		queue.add(new Dummy("Lorem Ipsum", 4));
		queue.add(new Dummy("HNU", 5));
	}

}
