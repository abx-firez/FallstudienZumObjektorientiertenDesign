package Queue;

import java.util.LinkedList;
import java.util.Queue;

import Comparator.Student;

public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Student> studis = new LinkedList<Student>();
		
		studis.offer(new Student("Maier", "Hugo", 111111, 5, 167));
		studis.offer(new Student("Müller", "Hans", 222222, 1, 201));
		studis.offer(new Student("Schulze", "Heinz", 333333, 4, 177));
		studis.offer(new Student("Schmid", "Heike", 444444, 2, 195));
		
		System.out.println(studis.poll());
		System.out.println("---------------------------------");
		
		// offer() v.a. wichtig f�r ArrayBlockingQueue<T>
		// gibt false zur�ck, wenn Element nicht eingef�gt werden kann, da Queue voll
		studis.offer(new Student("Meier", "Hanna", 555555, 2, 184));
		Student s;
		while ((s = studis.poll()) != null) {
			System.out.println(s);
		}

	}

}
