package datenstrukturen.tree;

import datenstrukturen.Studierenden;

public class TreeTest {

	public static void main(String[] args) {
		Tree students = new Tree();
		
		students.insert(new Studierenden(7829, "Mueller", "Michael"));
		students.insert(new Studierenden(8920, "Schmidt", "Gabi"));
		students.insert(new Studierenden(6272, "Mayer", "Olaf"));
		students.insert(new Studierenden(1672, "Hector", "Monika"));

		System.out.println(students);
		
	}

}
