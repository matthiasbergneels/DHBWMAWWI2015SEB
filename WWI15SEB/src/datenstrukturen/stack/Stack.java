package datenstrukturen.stack;

public class Stack<V>{
	
	private Element<V> peekElement;

	public void push(V data){
		Element<V> newElement = new Element<V>(data);
		if(peekElement == null){
			peekElement = newElement;
		}else{
			newElement.setPrevElement(peekElement);
			peekElement = newElement;
		}
	}
	
	public V peek(){
		if(peekElement != null){
			return peekElement.getData();
		}
		
		return null;
	}
	
	public V pop(){
		if(peekElement != null){
			V data = peekElement.getData();
			peekElement = peekElement.getPrevElement();
			return data;
		}
		
		return null;
		
	}
	
	private class Element<T>{
		private T data;
		private Element<T> prevElement;
	
		public Element(T data){
			this.setData(data);
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Element<T> getPrevElement() {
			return prevElement;
		}

		public void setPrevElement(Element<T> prevElement) {
			this.prevElement = prevElement;
		}
	
	}
	
	
}
