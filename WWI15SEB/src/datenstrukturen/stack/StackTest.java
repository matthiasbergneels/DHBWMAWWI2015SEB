package datenstrukturen.stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> wordStack = new Stack<String>();
		
		wordStack.push("Eins");
		wordStack.push("Zwei");
		wordStack.push("Drei");
		
		System.out.println(wordStack.peek());
		System.out.println(wordStack.pop());
		System.out.println(wordStack.pop());
		System.out.println(wordStack.pop());
		System.out.println(wordStack.pop());
		

	}

}
