package datenstrukturen.doublylinkedlist;

import datenstrukturen.Studierenden;

public class DoublyLinkedList {

		private Node firstNode;
		private Node lastNode;
		
		public void addLast(Studierenden data){
			Node newNode = new Node(data);
			if(firstNode == null && lastNode == null){
				firstNode = newNode;
				lastNode = newNode;
			}else{
				lastNode.setNextNode(newNode);
				newNode.setPrevNode(lastNode);
				lastNode = newNode;
			}
			
		}
		
		public void addFirst(Studierenden data){
			Node newNode = new Node(data);
			if(firstNode == null && lastNode == null){
				firstNode = newNode;
				lastNode = newNode;
			}else{
				firstNode.setPrevNode(newNode);
				newNode.setNextNode(firstNode);
				firstNode = newNode;
			}
		}
		
		public void delete(Studierenden s){
			Node n = findNode(s);
			if(n != null){
				if(n == lastNode){
					n.getPrevNode().setNextNode(null);
					return;
				}
				if(n == firstNode){
					n.getNextNode().setPrevNode(null);
					return;
				}
				
				n.getPrevNode().setNextNode(n.getNextNode());
				n.getNextNode().setPrevNode(n.getPrevNode());
			}
		}
		
		public void delete(int matrikelNr){
			Node n = findNode(matrikelNr);
			delete(n.getData());	
		}
		
		public void insertAfter(Studierenden prev, Studierenden data){
			Node n = findNode(prev);
			if(n != null){
				Node newNode = new Node(data);
				newNode.setNextNode(n.nextNode);
				n.setNextNode(newNode);
				newNode.setPrevNode(n);
				if(n == lastNode){
					lastNode = newNode;
				}
			}
		}
		
		public void insertAfter(int matrikelNr, Studierenden data){
			Node n = findNode(matrikelNr);
			if(n != null){
				Node newNode = new Node(data);
				newNode.setNextNode(n.nextNode);
				n.nextNode.setPrevNode(newNode);
				n.setNextNode(newNode);
				newNode.setPrevNode(n);
				if(n == lastNode){
					lastNode = newNode;
				}
			}
		}
		
		public Studierenden findByMatrikelNr(int matrikelNr){
			Node n = findNode(matrikelNr); 
			return n != null ? n.getData() : null;
		}
		
		private Node findNode(int matrikelNr){
			Node n = null;
			
			if(firstNode != null && lastNode != null){
				n = findNode(firstNode, matrikelNr);
			}
			
			return n;
		}
		
		private Node findNode(Node n, int matrikelNr) {
			if(n.getData().getMatrikelNr() == matrikelNr){
				return n;
			}
			
			if(n.getNextNode() != null){
				return findNode(n.getNextNode(), matrikelNr);
			}
			
			return null;
		}

		private Node findNode(Studierenden s){
			
			return findNode(s.getMatrikelNr());
		}
		
		@Override
		public String toString() {
			if(firstNode == null && lastNode == null){
				return "Empty list";
			}else{
				return toString(firstNode);
			}
		}
		
		private String toString(Node node){
			String s = "";
			s += node.getData() + "\n";
			if(node.getNextNode() != null){
				s += toString(node.getNextNode());
			}
			return s;
		}
		
		public String reverseToString() {
			if(firstNode == null && lastNode == null){
				return "Empty list";
			}else{
				return reverseToString(lastNode);
			}
		}
		
		private String reverseToString(Node node){
			String s = "";
			s += node.getData() + "\n";
			if(node.getPrevNode() != null){
				s += reverseToString(node.getPrevNode());
			}
			return s;
		}
		
		
		private class Node{
		
			private Studierenden data;
			private Node prevNode;
			private Node nextNode;
			
			public Node(Studierenden data){
				this.data = data;
				this.prevNode = null;
				this.nextNode = null;
			}
			
			public Studierenden getData(){
				return this.data;
			}

			public Node getPrevNode() {
				return prevNode;
			}

			public void setPrevNode(Node prevNode) {
				this.prevNode = prevNode;
			}

			public Node getNextNode() {
				return nextNode;
			}

			public void setNextNode(Node nextNode) {
				this.nextNode = nextNode;
			}
		}
		
	

}
