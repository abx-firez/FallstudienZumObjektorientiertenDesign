package Comparator;

import java.util.Comparator;

public class VglStudentGroesse implements Comparator<Student> {
	public int compare(Student s1, Student s2){
		return s1.getGroesse() - s2.getGroesse();
	}

}
