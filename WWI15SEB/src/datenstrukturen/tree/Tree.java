package datenstrukturen.tree;

import datenstrukturen.Studierenden;

public class Tree {

	Node root = null;
	
	public void insert(Studierenden s){
		if(root == null){
			root = new Node(s);
		}else{
			insert(root, s);
		}
	}
	
	private void insert(Node n, Studierenden s){
		if(n.getData().getMatrikelNr() > s.getMatrikelNr()){
			if(n.getLeftNode() != null){
				insert(n.getLeftNode(), s);
			}else{
				Node newNode = new Node(s);
				n.setLeftNode(newNode);
			}
			
		}else if(n.getData().getMatrikelNr() < s.getMatrikelNr()){
			if(n.getRightNode() != null){
				insert(n.getRightNode(), s);
			}else{
				Node newNode = new Node(s);
				n.setRightNode(newNode);
			}
		}
	}
	
	@Override
	public String toString() {
		String s = "";
		if(root == null){
			s = "Empty Tree";
		}else{
			s = toString(root);
		}
		
		return s;
	}
	
	private String toString(Node n){
		String s = "";
		if(n.getLeftNode() != null){
			s += toString(n.getLeftNode());
		}
		
		s += n.getData().toString() + "\n";
		
		if(n.getRightNode() != null){
			s += toString(n.getRightNode());
		}
		
		return s;
		
	}
	
	private class Node{
		Studierenden data;
		Node leftNode = null;
		Node rightNode = null;
		
		public Node(Studierenden s){
			this.setData(s);
		}
		
		public Studierenden getData() {
			return data;
		}
		private void setData(Studierenden data) {
			this.data = data;
		}
		public Node getLeftNode() {
			return leftNode;
		}
		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}
		public Node getRightNode() {
			return rightNode;
		}
		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}
		
		
	}
	
}
