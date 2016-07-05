package datenstrukturen.doublylinkedlist;

import datenstrukturen.Studierenden;

public class DoublyLinkedListTest {

		public static void main(String[] args) {
			
			DoublyLinkedList students = new DoublyLinkedList();
			
			students.addFirst(new Studierenden(7892, "Mueller", "Klaus"));
			students.addFirst(new Studierenden(7829, "Mueller", "Klaus"));
			students.addFirst(new Studierenden(1627, "Mueller", "Klaus"));
			students.addFirst(new Studierenden(9827, "Mueller", "Klaus"));
			students.addFirst(new Studierenden(1782, "Mueller", "Klaus"));
			students.addFirst(new Studierenden(5637, "Mueller", "Klaus"));
			
			System.out.println(students);
			System.out.println(students.reverseToString());
			
			System.out.println("Find 9827: " + students.findByMatrikelNr(9827));

			students.insertAfter(1627, new Studierenden(9999, "Mueller", "Klaus"));
			
			System.out.println(students);
			System.out.println(students.reverseToString());
			
			students.delete(9827);
			
			System.out.println(students);
			System.out.println(students.reverseToString());
			
			
		}

	}
