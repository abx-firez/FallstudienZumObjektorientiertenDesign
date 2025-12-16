package Stack;

import java.util.Stack;

import Comparator.Student;

public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Student> studis = new Stack<Student>();
		
		studis.push(new Student("Maier", "Hugo", 111111, 5, 167));
		studis.push(new Student("Müller", "Hans", 222222, 1, 201));
		studis.push(new Student("Schulze", "Heinz", 333333, 4, 177));
		studis.push(new Student("Schmid", "Heike", 444444, 2, 195));
		
		System.out.println(studis.peek());
		
		studis.push(new Student("Meier", "Hanna", 555555, 2, 184));
		
		System.out.println("----------------------------------");
		while (!studis.isEmpty()) {
			System.out.println(studis.pop());
		}

	}

}
