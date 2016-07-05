package datenstrukturen.linkdedlist;

import datenstrukturen.Studierenden;

public class LinkedList {

	Node firstNode = null;
	
	public Studierenden getFirst(){
		return firstNode.getData();
	}
	
	public void add(Studierenden s){
		Node newNode = new Node(s);
		newNode.setNextNode(firstNode);
		firstNode = newNode;
	}
	
	public void addLast(Studierenden s){
		
		if(firstNode == null){
			add(s);
			return;
		}

		getLast(firstNode).setNextNode(new Node(s));
	}
	
	public void addAfter(int matrikelNr, Studierenden s){
		Node prevNode = findNode(matrikelNr);
		if(prevNode != null){
			Node newNode = new Node(s);
			newNode.setNextNode(prevNode.getNextNode());
			prevNode.setNextNode(newNode);
		}
		
	}
	
	public Studierenden find(int matrikelNr){
		
		Node n = findNode(matrikelNr);
		if(n != null){
			return n.getData();
		}
		
		return null;
	}
	
	private Node findNode(int matrikelNr){
		if(firstNode == null){
			return null;
		}
		
		return findNode(firstNode, matrikelNr);
	}
	
	private Node findNode(Node n, int matrikelNr){
		if(n.getData().getMatrikelNr() == matrikelNr){
			return n;
		}
		if(n.getNextNode() != null){
			return findNode(n.getNextNode(), matrikelNr);
		}
		
		return null;
		
	}
	
	private Node getLast(Node n){
		if(n.getNextNode() == null){
			return n;
		}
		
		return getLast(n.getNextNode());
	}
	
	
	public void printList(){
		if(firstNode == null){
			System.out.println("Empty List");
		}else{
			Node n = firstNode;
			while(n != null){
				System.out.println(n.getData());
				n = n.getNextNode();
			}
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		
		if(firstNode == null){
			s = "Empty List";
		}else{
			s = toString(firstNode);	
		}
		return s;
	}
	
	private String toString(Node n){
		String s = n.getData().toString() + "\n";
		if(n.getNextNode() != null){
			s += toString(n.getNextNode());
		}
		
		return s;
	}
	
	private class Node{
		private Studierenden data;
		private Node nextNode;
		
		public Node(Studierenden data){
			this.data = data;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public Studierenden getData() {
			return data;
		}
		
		
	}
	
}
