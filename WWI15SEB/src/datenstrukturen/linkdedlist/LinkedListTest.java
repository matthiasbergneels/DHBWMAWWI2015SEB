package datenstrukturen.linkdedlist;

import datenstrukturen.Studierenden;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList students = new LinkedList();
		
		students.add(new Studierenden(7829, "Mueller", "Michael"));
		students.add(new Studierenden(8920, "Schmidt", "Gabi"));
		students.add(new Studierenden(6272, "Mayer", "Olaf"));
		students.add(new Studierenden(1672, "Hector", "Monika"));
		
		
		System.out.println(students);

		students.addLast(new Studierenden(9999, "Friedrich", "Klaus"));
		
		System.out.println(students);
		
		System.out.println("Find 8920: " + students.find(8920));
		System.out.println("Find 8888: " + students.find(8888));
		
		students.addAfter(6272, new Studierenden(7629, "Schiller", "Sarah"));
		
		System.out.println(students);
		
		students.printList();
	}

}
